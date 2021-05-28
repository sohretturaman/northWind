package kodlama.io.hrmstrials.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

 @Table( name="employees")
public class Employee  extends User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name="employee_first_name")
    private String firstName ;

    @Column( name ="employee_last_name")
    private String lastName ;

    @Column(name ="birth_date")
    private String birthDate ;

    @Column(name="tc_no")
    private String tcNo ;

}
