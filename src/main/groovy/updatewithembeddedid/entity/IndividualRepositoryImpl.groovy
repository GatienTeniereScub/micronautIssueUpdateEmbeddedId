package updatewithembeddedid.entity

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
import io.micronaut.spring.tx.annotation.Transactional

import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Singleton
class IndividualRepositoryImpl implements IndividualRepository{
    /*@Inject
    JdbcOperations jdbcOperations
*/
    @PersistenceContext
    EntityManager entityManager

    IndividualRepositoryImpl(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager
    }
/*
    @Override
    @javax.transaction.Transactional
    int countUsingQuery(String query) {
        jdbcOperations.prepareStatement(query, { statement ->
            final resultSet = statement.executeQuery()
            resultSet.next()
            resultSet.getInt('count')
        })
    }
*/
//    @Override
    @Transactional
    void deleteById(Long id) {
        findById(id).ifPresent(
    {individual -> entityManager.remove(individual)}
        )
    }

//    @Override
    @Transactional
    Optional<IndividualEntity> findById(Long id) {
        return Optional.ofNullable(entityManager.find(IndividualEntity.class, id))
    }

//    @Override
    @Transactional
    IndividualEntity save(IndividualEntity individualEntity) {
        entityManager.persist(individualEntity)
        return individualEntity
    }
/*
    @Override
    @javax.transaction.Transactional
    List<IndividualEntity> searchUsingQuery(String query) {
        jdbcOperations.prepareStatement(query, { statement ->
            jdbcOperations.entityStream(statement.executeQuery(), IndividualEntity.class)
                    .collect(Collectors.toList())
        })
    }*/

//    @Override
    @Transactional
    IndividualEntity update(IndividualEntity individualEntity) {
        entityManager.merge(individualEntity)
    }
}
