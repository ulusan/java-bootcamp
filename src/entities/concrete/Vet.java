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
@Table(name="vets")
public class Vet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vets_id")
    private int vets_id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "date_of_graduation")
    private Date date_of_graduation;
}
