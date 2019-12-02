package com.wildcodeschool.wildandwizard.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String birthPlace;
    private String biography;
    private boolean muggle;

    @ManyToMany
    @JoinTable(name = "wizard_course",
    joinColumns = @JoinColumn(name = "wizard_id"),
    inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses = new ArrayList<>();

    public Wizard() {
    }
}