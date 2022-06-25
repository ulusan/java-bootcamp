package entities.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="visits")
public class Visit {

    @Column(name="animal_id")
    private int animal_id;

    @Column(name="vets_id")
    private int vets_id;

    @Column(name = "visit_date")
    private Date visit_date;
}
