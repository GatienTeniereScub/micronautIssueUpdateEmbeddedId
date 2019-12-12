# micronautIssueUpdateEmbeddedId
Reproduce issue update entity with embedded id, micronaut data.

localhost:8080/employee/insert
Insert entity 

    Employee {
      EmployeeEmbeddedId id : {
        String companyId: '1'
        String individualId: '1'
      }
      String firstName: 'John'
      String lastName: 'Doe'
    }

localhost:8080/employee/find
Fetch John Doe entity

localhost:8080/employee/update
Update John Doe to Jane Doe

    Employee {
      EmployeeEmbeddedId id : {
        String companyId: '1'
        String individualId: '1'
      }
      String firstName: 'Jane'
      String lastName: 'Doe'
    }
