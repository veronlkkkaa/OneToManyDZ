package org.example.onetomanydz4;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String city;

    @OneToMany(mappedBy = "user")
    List<SimCard> simcardsList = new ArrayList<SimCard>();

}
