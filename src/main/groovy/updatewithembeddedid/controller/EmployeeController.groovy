package updatewithembeddedid.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import updatewithembeddedid.entity.Employee
import updatewithembeddedid.entity.EmployeeEmbeddedId
import updatewithembeddedid.repository.EmployeeRepository

import javax.inject.Inject

@Controller('/employee')
class EmployeeController {
    String companyId = '1';
    String individualId = '1'

    EmployeeEmbeddedId idJohnDoe = new EmployeeEmbeddedId(companyId, individualId)

    @Inject
    EmployeeRepository employeeRepository

    @Get('/find')
    Employee findJohnDoe () {
        employeeRepository.findById(idJohnDoe).get()
    }

    @Get('/insert')
    void insertJohnDoe() {
        Employee employee = new Employee();
        employee.id = idJohnDoe
        employee.firstName = 'John'
        employee.lastName = 'Doe'

        employeeRepository.save(employee)
    }

    @Get('/update')
    void updateJohnDoeToJaneDoe () {
        Employee employee = new Employee();
        employee.id = idJohnDoe
        employee.firstName = 'Jane'
        employee.lastName = 'Doe'

        employeeRepository.update(employee)
    }
}
