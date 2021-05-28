package kodlama.io.hrmstrials.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

@Table(name = "job_positions")
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="job_name")
    private String jobName ;

}
