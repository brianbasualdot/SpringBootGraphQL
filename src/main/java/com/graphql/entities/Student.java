package com.graphql.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Course.class)  // Many es porque son muchos estudiantes para UN curso.
    // Lazy es para optimizar el rendimiento y no llamar objetos enteros, target es para mapear a una clase en particular.
    private Course course;

}

