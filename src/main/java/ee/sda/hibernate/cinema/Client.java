package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "clients", schema = "cinema")
public class Client {
    private Integer clientId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;

}
