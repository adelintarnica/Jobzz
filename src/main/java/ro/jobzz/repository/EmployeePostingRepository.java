package ro.jobzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.jobzz.entity.EmployeePosting;

@Repository
public interface EmployeePostingRepository extends JpaRepository<EmployeePosting, Integer> {
}
