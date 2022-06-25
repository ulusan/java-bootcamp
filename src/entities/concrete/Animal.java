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
@Table(name="animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="animals_id")
    private int animals_id;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    private Date date_of_birth;

    @Column(name = "escape_attemps")
    private int escape_attemps;

    @Column(name = "neutered")
    private boolean neutered;

    @Column(name = "weight_kg")
    private Double weight_kg;

    @Column(name = "species_id")
    private int species_id;

    @Column(name = "owners_id")
    private int owners_id;

}
