package updatewithembeddedid.repository

import updatewithembeddedid.entity.Employee
import updatewithembeddedid.entity.EmployeeEmbeddedId

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
import io.micronaut.spring.tx.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.inject.Singleton

@Singleton
class EmployeeRepository {

    @PersistenceContext
    EntityManager entityManager

    EmployeeRepository(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager
    }

    @Transactional
    Employee findById(EmployeeEmbeddedId employeeEmbeddedId) {
        entityManager.find(Employee.class, employeeEmbeddedId)
    }

    @Transactional
    Employee save(Employee employee) {
        entityManager.persist(employee)
    }

    @Transactional
    void update(Employee employee) {
        entityManager.merge(employee)
    }
}
