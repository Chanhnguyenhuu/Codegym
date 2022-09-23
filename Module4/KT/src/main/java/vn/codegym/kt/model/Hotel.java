package vn.codegym.kt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class E2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "e2")
    private Set<E1> e1s;
}
