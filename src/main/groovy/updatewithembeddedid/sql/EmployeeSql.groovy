package updatewithembeddedid.sql

import groovy.sql.Sql
import io.micronaut.context.annotation.Context
import updatewithembeddedid.entity.Employee
import  updatewithembeddedid.enums.EmployeeToSALARIE;

import javax.annotation.PostConstruct
import javax.inject.Inject
import javax.sql.DataSource

@Context
class EmployeeSql {

    @Inject
    DataSource dataSource

    Sql sql
    String tableName
    List<String> primaryKeysColumnName

    EmployeeSql() {
        primaryKeysColumnName = ['SOCIETE', 'INDIVIDU']
        tableName = 'SALARIE'
    }

    @PostConstruct
    initSql() {
        sql = new Sql(dataSource)
    }

    void update(Employee employee) {
        def employeeProperties = employee.properties
        employeeProperties.remove('class')
        employeeProperties.removeAll { k,v -> v == null}

        Map<String, String> mapColumnValue = [:]
        employeeProperties.each { key, value ->
            final sqlColumn = EmployeeToSALARIE[key].salarieColumn as String
            final sqlValue = value.toString()
            mapColumnValue.put(sqlColumn, sqlValue)
        }

        mapColumnValue.subMap()

        executeUpdate(this.tableName, mapColumnValue - mapColumnValue.subMap(primaryKeysColumnName),mapColumnValue.subMap(primaryKeysColumnName), this.sql)
    }

    static void executeUpdate(String table, Map<String, String> body, Map<String, String> primaryKey, Sql sql) {

        final updateQuery = "UPDATE $table SET ${body.keySet().collect({key -> "$key = :$key"}).join(',')} WHERE ${primaryKey.keySet().collect({key -> "$key = :$key"}).join(' AND ')}".toString()

        sql.executeUpdate(body + primaryKey, updateQuery)
    }
}
