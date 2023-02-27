package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "rooms", schema = "cinema")
public class Room {
    private Integer roomId;
    private Integer number;
    private Integer maxSeats;
    private String location;

}
