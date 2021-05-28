package kodlama.io.hrmstrials.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employers")
public class Employer extends User{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)

    @Column (name="company_name")
    private String companyName ;

    @Column(name="website")
    private String websiteURL ;

    @Column(name="phone_number")
    private String phoneNumber ;

}
