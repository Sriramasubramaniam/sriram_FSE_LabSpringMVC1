package com.greatlearning.Ems.model;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;
    @Column(name = "first_name", nullable = false)
    public String firstName;
    @Column(name = "last_name", nullable = false)
    public String lastName;
    @Column(name = "email", nullable = false)
    public String email;
}
