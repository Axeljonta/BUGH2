package com.axel.ClinicaOdontologica2.repository;

import com.axel.ClinicaOdontologica2.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Hereda de JPA, asi no escribimos mas SQL
@Repository
public interface DentistRepository extends JpaRepository<Dentist, Integer> {


}
