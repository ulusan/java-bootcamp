package entities.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="specializations")
public class Specialization {

    @Column(name="species_id")
    private int species_id;

    @Column(name="vets_id")
    private int vets_id;
}
