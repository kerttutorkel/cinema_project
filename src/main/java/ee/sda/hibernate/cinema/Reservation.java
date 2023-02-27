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
    private Integer reservationId;
    private Boolean isPaid; //in MySQL true/false is replaced by 1/0
    private Schedule schedule;
    private Client client;
}
