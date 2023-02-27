package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Schedule {
    private Room room;
    private Movie movie;
}
