package updatewithembeddedid.entity

import io.micronaut.data.annotation.EmbeddedId
import io.micronaut.data.annotation.MappedEntity

@MappedEntity(value = 'EMPLOYE')
class Employee {
    @EmbeddedId
    EmployeeEmbeddedId id

    String lastName

    String firstName
}
