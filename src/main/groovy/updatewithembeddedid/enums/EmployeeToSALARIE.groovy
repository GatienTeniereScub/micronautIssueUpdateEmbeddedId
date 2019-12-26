package updatewithembeddedid.enums

/*
    Mapping field of Employee to the column name of the table SALARIE
 */
enum EmployeeToSALARIE {
    companyId('SOCIETE'),

    individualId('INDIVIDU'),

    lastName('NOM'),

    firstName('PRENOM')

    private final String salarieColumn

    private EmployeeToSALARIE(String salarieColumn) {
        this.salarieColumn = salarieColumn
    }

    String salarieColumn() {salarieColumn}
}