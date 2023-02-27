package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ticket {

    private TicketCategory category;
    private Seat seat;
    private Schedule schedule;
}
