package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "schedules", schema = "cinema")
public class Schedule {
    private Integer scheduleId;
    private LocalDateTime startTime;
    private Room room;
    private Movie movie;
}
