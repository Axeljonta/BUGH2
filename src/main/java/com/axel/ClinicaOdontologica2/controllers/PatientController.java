package com.axel.ClinicaOdontologica2.controllers;

import com.axel.ClinicaOdontologica2.entities.Patient;
import com.axel.ClinicaOdontologica2.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient){
        return patientService.save(patient);
    }

    @GetMapping("/all")
    public List<Patient> getAll(){
        return patientService.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Patient> findById(@PathVariable Integer id){
        Optional<Patient> patient = patientService.findById(id);
        if(patient.isPresent()){
            return ResponseEntity.ok(patient.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping
    public Patient update(@RequestBody Patient patient){
        Optional<Patient> patientOptional = patientService.findById(patient.getId());
        if(patientOptional.isPresent()){
            return patientService.save(patient);
        } else {
            return patient;
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        Optional<Patient> patientOptional = patientService.findById(id);
        if(patientOptional.isPresent()){
            patientService.delete(id);
            return "Se eliminó correctamente";
        }
        else {
            return "No se encontró el paciente";
        }
    }

    @GetMapping("/lastname/{lastName}")
    public Patient findByLastName(@PathVariable String lastName){
        Optional<Patient> patient = patientService.findByLastName(lastName);
        if(patient.isPresent()){
            return patient.get();
        }
        else  {
            return null;
        }
    }
}

