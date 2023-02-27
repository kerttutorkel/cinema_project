package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "schedules", schema = "cinema")
public class Schedule {
    private Room room;
    private Movie movie;
}
