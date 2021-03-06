package ro.jobzz.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.jobzz.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @SuppressWarnings("unchecked")
    Employee saveAndFlush(Employee employee);

    Employee findByEmail(String email);

}
