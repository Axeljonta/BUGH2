package com.axel.ClinicaOdontologica2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Name;

    private String LastName;

    private String cardIdentity;

    private LocalDate admissionDate;

    public Patient() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCardIdentity() {
        return cardIdentity;
    }

    public void setCardIdentity(String cardIdentity) {
        this.cardIdentity = cardIdentity;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
}
