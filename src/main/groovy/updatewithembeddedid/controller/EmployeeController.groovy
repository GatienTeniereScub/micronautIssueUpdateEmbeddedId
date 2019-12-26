package updatewithembeddedid.controller

import io.micronaut.data.model.query.QueryModel
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import updatewithembeddedid.entity.Employee
import updatewithembeddedid.entity.EmployeeEmbeddedId
import updatewithembeddedid.entity.EmployeeEntity
import updatewithembeddedid.repository.EmployeeRepository
import updatewithembeddedid.sql.EmployeeSql

import javax.inject.Inject

@Controller('/employee')
class EmployeeController {
    String companyId = '1';
    String individualId = '1'

    EmployeeEmbeddedId idJohnDoe = new EmployeeEmbeddedId(companyId, individualId)

    @Inject
    EmployeeRepository employeeRepository

    @Inject
    EmployeeSql employeeSql

    @Get('/find')
    EmployeeEntity findJohnDoe () {
        employeeRepository.findById(idJohnDoe).get()
    }

    @Get('/insert')
    void insertJohnDoe() {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.id = idJohnDoe
        employeeEntity.firstName = 'John'
        employeeEntity.lastName = 'Doe'

        employeeRepository.save(employeeEntity)
    }

    @Get('/update')
    void updateJohnDoeToJaneDoe () {
        Employee employee = new Employee();
        employee.companyId = companyId
        employee.individualId = individualId
        employee.firstName = 'Jane'
        employee.lastName = 'Doe'

        employeeSql.update(employee)
    }
}
