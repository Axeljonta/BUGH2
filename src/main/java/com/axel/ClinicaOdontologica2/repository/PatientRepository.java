package com.axel.ClinicaOdontologica2.repository;

import com.axel.ClinicaOdontologica2.entities.Patient;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {


    @Query("SELECT p FROM Patient p WHERE p.lastName =?1")
    Optional<Patient> findByLastName(String lastName);


}


