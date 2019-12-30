package updatewithembeddedid.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'INDIVIDUAL')
class Individual {
    @Id
    @Column(name = 'INDIVIDU')
    String id

    @Column(name = 'NOM')
    String lastName

    @Column(name = 'PRENOM')
    String firstName
}
