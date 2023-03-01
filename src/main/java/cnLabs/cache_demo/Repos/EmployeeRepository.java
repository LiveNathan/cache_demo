package cnLabs.cache_demo.Repos;

import cnLabs.cache_demo.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}