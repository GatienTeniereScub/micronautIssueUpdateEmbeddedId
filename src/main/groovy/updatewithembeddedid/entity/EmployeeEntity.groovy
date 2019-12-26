package updatewithembeddedid.entity

import io.micronaut.data.annotation.EmbeddedId
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty

@MappedEntity(value = 'SALARIE')
class EmployeeEntity {
    @EmbeddedId
    EmployeeEmbeddedId id

    @MappedProperty('NOM')
    String lastName

    @MappedProperty('PRENOM')
    String firstName
}
