package com.example.library.entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column
    @CreationTimestamp
    private Date dateCreated;

    @Column
    @UpdateTimestamp
    private Date lastUpdated;

    @OneToMany
    @JoinColumn(name = "car_id")
    private List<Car> cars = new ArrayList<>();

}
