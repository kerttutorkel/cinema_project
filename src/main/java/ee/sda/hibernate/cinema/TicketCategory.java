package ee.sda.hibernate.cinema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ticket_categories", schema = "cinema")
public class TicketCategory {
    private Integer ticketCategoryId;
    private String type;
    private Integer price;
}
