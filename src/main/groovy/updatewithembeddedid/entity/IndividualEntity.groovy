package updatewithembeddedid.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'INDIVIDU')
class IndividualEntity {

    @Id
    @Column(name = 'INDIVIDU')
    Long id

    @Column(name = 'TITRE')
    String title

    @Column(name = 'NOM')
    String lastName

    @Column(name = 'PRENOM')
    String firstName

    @Column(name = 'NOSS')
    String socialSecurityNumber

    @Column(name = 'SEXE')
    String sex

    @Column(name = 'DNAI')
    String birthDate

    @Column(name = 'NATION')
    String nationality

    @Column(name = 'ZONEGEO')
    String geographicArea

    @Column(name = 'CODPOST')
    String postalCode

    @Column(name = 'VILLE')
    String city

    @Column(name = 'PAYS')
    String country

    @Column(name = 'SITFAM')
    String familySituation

    @Column(name = 'INTERIM')
    String interim

    @Column(name = 'HANDICAP')
    String handicap

    @Column(name = 'FONCPUB')
    String foncpub

    @Column(name = 'DCRE')
    String creationDate

    @Column(name = 'DMAJ')
    String updateDate

    @Column(name = 'ACCES')
    String access

    @Column(name = 'CONTRAT')
    Integer contract

    @Column(name = 'REPONDEUR')
    String	answering

    @Column(name = 'NOMJF')
    String	maidenName

    @Column(name = 'NOMP')
    String	lastnameP

    @Column(name = 'PRENOMP')
    String	firstnameP

    @Column(name = 'CLESS')
    String	cless

    @Column(name = 'DEPTSS')
    String	socialSecurityDepartment

    @Column(name = 'CENTRESS')
    String	securitySocialCenter

    @Column(name = 'LIEUNAI')
    String	placeOfBirth

    @Column(name = 'PAYSNAI')
    String	countryOfBirth

    @Column(name = 'DENTFR')
    String	dentfr

    @Column(name = 'COMPADR')
    String	compadre

    @Column(name = 'NUMVOIE')
    String	roadNumber

    @Column(name = 'BISTER')
    String	bister

    @Column(name = 'ADR1')
    String	adress1

    @Column(name = 'ADR2')
    String	adress2

    @Column(name = 'COMMUNE')
    String	town

    @Column(name = 'DEPART')
    String	department

    @Column(name = 'TELEP')
    String	phoneNumber

    @Column(name = 'COMPADRF')
    String	compadrF

    @Column(name = 'NUMVOIEF')
    String	roadNumberF

    @Column(name = 'BISTERF')
    String	bisterF

    @Column(name = 'ADR1F')
    String	adress1F

    @Column(name = 'ADR2F')
    String	adress2F

    @Column(name = 'CODPOSTF')
    String	postalCodeF

    @Column(name = 'VILLEF')
    String	cityF

    @Column(name = 'PAYSF')
    String	countryF

    @Column(name = 'TELEPF')
    String	phoneNumberF

    @Column(name = 'ENF')
    Integer	enf

    @Column(name = 'ENFCH')
    Integer	enfCh

    @Column(name = 'PERSCH')
    Integer	persch

    @Column(name = 'SOCINT')
    String	socint

    @Column(name = 'AGINT')
    String	agint

    @Column(name = 'TEXTEINT')
    String	texteint

    @Column(name = 'TAUXHAND')
    Integer	tauxhand

    @Column(name = 'CATHAND')
    String	cathand

    @Column(name = 'FAX')
    String	fax

    @Column(name = 'PLACHAND')
    String	placHand

    @Column(name = 'AUTRHAND')
    String	autrhand

    @Column(name = 'TELPORT')
    String	telport

    @Column(name = 'EMAIL')
    String	mail

    @Column(name = 'HTTP')
    String	http

    @Column(name = 'CODIFIND1')
    String	codifind1

    @Column(name = 'CODIFIND2')
    String	codifind2

    @Column(name = 'CODIFIND3')
    String	codifind3

    @Column(name = 'CODIFIND4')
    String	codifind4

    @Column(name = 'CODIFIND5')
    String	codifind5

    @Column(name = 'TEXTIND1')
    String	textInd1

    @Column(name = 'TEXTIND2')
    String	textInd2

    @Column(name = 'VALIND1')
    Integer	valInd1

    @Column(name = 'VALIND2')
    Integer	valInd2

    @Column(name = 'VALIND3')
    Integer	valInd3

    @Column(name = 'DATIND1')
    String	datInd1

    @Column(name = 'DATIND2')
    String	datInd2

    @Column(name = 'DATIND3')
    String	datInd3

}
