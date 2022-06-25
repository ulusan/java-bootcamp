package entities.concrete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="owners")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="owners_id")
    private int owners_id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "age")
    private int age;
}
