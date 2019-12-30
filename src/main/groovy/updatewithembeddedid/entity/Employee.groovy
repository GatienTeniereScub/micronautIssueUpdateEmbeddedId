package updatewithembeddedid.entity

import javax.persistence.CascadeType
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = 'SALARIE')
class Employee {

    @EmbeddedId
    EmployeeEmbeddedId id

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INDIVIDU_ID", referencedColumnName = "INDIVIDU")
    Individual individual
}
