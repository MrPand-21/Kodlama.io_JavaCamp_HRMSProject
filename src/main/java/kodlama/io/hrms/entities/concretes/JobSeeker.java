package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlama.io.hrms.entities.abstracts.User;
import lombok.*;

import javax.persistence.*;

@Data
@Table(name = "job_seekers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker{

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "national_id")
    private long nationality_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "year_of_birth")
    private int year_of_birth;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "userId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

}
