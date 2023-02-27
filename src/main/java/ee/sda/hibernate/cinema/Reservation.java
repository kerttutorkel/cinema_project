package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "reservations", schema = "cinema")
@NoArgsConstructor
public class Reservation {
    private Schedule schedule;
    private Client client;
}
