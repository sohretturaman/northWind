package kodlama.io.hrmstrials.dataAccess.abstracts;

import kodlama.io.hrmstrials.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
