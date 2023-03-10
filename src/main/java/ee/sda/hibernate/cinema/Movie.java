package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "movies", schema = "cinema")
public class Movie {
    private Integer movieId;
    private String name;
    private String category;
    private Integer durationInMinutes;
    private String description;
}
