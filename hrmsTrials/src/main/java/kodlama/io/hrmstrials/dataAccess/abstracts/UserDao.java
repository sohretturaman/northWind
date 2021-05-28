package kodlama.io.hrmstrials.dataAccess.abstracts;

import kodlama.io.hrmstrials.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
