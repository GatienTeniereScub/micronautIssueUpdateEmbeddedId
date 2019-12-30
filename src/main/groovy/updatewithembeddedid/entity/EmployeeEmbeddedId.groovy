package updatewithembeddedid.entity

import javax.persistence.Embeddable

@Embeddable
class EmployeeEmbeddedId implements Serializable {
    String companyId

    String individualId

    EmployeeEmbeddedId() {}

    EmployeeEmbeddedId(String companyId, String individualId) {
        this.companyId = companyId
        this.individualId = individualId
    }
}
