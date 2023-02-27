package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tickets", schema = "cinema")
public class Ticket {

    private Integer ticketId;
    private TicketCategory category;
    private Seat seat;
    private Schedule schedule;

}
