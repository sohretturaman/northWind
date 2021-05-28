package kodlama.io.hrmstrials.dataAccess.abstracts;

import kodlama.io.hrmstrials.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {

}
