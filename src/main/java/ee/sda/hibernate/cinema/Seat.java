package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Seat {

    private Room room;
}