package com.axel.ClinicaOdontologica2.repository;

import com.axel.ClinicaOdontologica2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
