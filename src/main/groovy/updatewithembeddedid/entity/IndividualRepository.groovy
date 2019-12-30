package updatewithembeddedid.entity

interface IndividualRepository {

    /**
     * @param query
     * @return number of individual matching query
     */
    /*int countUsingQuery(String query)*/

    /**
     * Delete individual by id
     * @param id
     */
    void deleteById(Long id)

    /**
     * @param id
     * @return individual by id or null if it doesn't exist
     */
    Optional<IndividualEntity> findById(Long id)

    /**
     * Persist individualEntity
     * @param individualEntity
     * @return the individualEntity that have been persisted
     */
    IndividualEntity save(IndividualEntity individualEntity)

    /**
     * @param query
     * @return list of individual matching the query
     */
    /*List<IndividualEntity> searchUsingQuery(String query)*/

    /**
     * Update individual in database corresponding to the id of individualEntity with values of individualEntity
     * @param individualEntity
     * @return IndividualEntity that has been updated
     */
    IndividualEntity update(IndividualEntity individualEntity)
}