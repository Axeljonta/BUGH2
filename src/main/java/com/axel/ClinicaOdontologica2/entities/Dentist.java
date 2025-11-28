package com.axel.ClinicaOdontologica2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Dentists")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Dentist")
    private Integer id;

    @Column(name = "registration",nullable = false)
    private Integer registration;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    public Dentist() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
