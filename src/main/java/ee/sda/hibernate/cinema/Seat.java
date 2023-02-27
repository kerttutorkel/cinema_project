package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "seats", schema = "cinema")
public class Seat {

    private Integer seatId;
    private Integer row;
    private Integer number;
    private Room room;
}
