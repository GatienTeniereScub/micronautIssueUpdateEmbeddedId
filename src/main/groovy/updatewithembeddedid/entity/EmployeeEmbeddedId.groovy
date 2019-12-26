package updatewithembeddedid.entity

import io.micronaut.data.annotation.Embeddable
import io.micronaut.data.annotation.MappedProperty

@Embeddable
class EmployeeEmbeddedId {

    @MappedProperty('SOCIETE')
    String companyId

    @MappedProperty('INDIVIDU')
    String individualId

    EmployeeEmbeddedId(String companyId, String individualId) {
        this.companyId = companyId
        this.individualId = individualId
    }
}
