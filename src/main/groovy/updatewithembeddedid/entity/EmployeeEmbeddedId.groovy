package updatewithembeddedid.entity

import io.micronaut.data.annotation.Embeddable

@Embeddable
class EmployeeEmbeddedId {
    String companyId

    String individualId

    EmployeeEmbeddedId(String companyId, String individualId) {
        this.companyId = companyId
        this.individualId = individualId
    }
}
