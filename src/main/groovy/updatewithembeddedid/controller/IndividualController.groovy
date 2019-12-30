package updatewithembeddedid.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import updatewithembeddedid.entity.IndividualEntity
import updatewithembeddedid.entity.IndividualRepository

import javax.inject.Inject

@Controller('/individual')
class IndividualController {
    @Inject
    private IndividualRepository individualRepository

    @Get('/insert')
    void insert() {
        IndividualEntity individualEntity = new IndividualEntity()
        individualEntity.setId(-999)
        individualEntity.setTitle('M.')
        individualEntity.setLastName('Elric')
        individualEntity.setFirstName('Edward')
        individualEntity.setSocialSecurityNumber('100456789123')
        individualEntity.setSex('M')
        individualEntity.setBirthDate('0000-01-01')
        individualEntity.setNationality('F')
        individualEntity.setGeographicArea('M')
        individualEntity.setPostalCode('76110')
        individualEntity.setCity('Bdm city')
        individualEntity.setCountry('F')
        individualEntity.setFamilySituation('C')
        individualEntity.setCreationDate('2019-12-11')
        individualEntity.setUpdateDate('2019-12-11')
        individualEntity.setAccess('?')
        individualEntity.setContract(100)
        individualEntity.setHandicap('O')
        individualEntity.setCountryOfBirth('B')



        individualRepository.save(individualEntity)
    }
}
