package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Reservation {
    private Schedule schedule;
    private Client client;
}
