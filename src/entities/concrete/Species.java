package entities.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="species_id")
    private int species_id;

    @Column(name = "name")
    private String name;
}
