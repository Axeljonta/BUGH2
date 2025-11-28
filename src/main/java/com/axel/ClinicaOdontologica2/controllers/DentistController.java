package com.axel.ClinicaOdontologica2.controllers;

import com.axel.ClinicaOdontologica2.entities.Dentist;
import com.axel.ClinicaOdontologica2.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentist")
public class DentistController {

    private final DentistService dentistService;

    @Autowired
    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    @PostMapping
    public Dentist save(@RequestBody Dentist dentist){
        return dentistService.save(dentist);
    }

    @GetMapping("/all")
    public List<Dentist> getAll(){
        return dentistService.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Dentist> findById(@PathVariable Integer id){
        Optional<Dentist> dentist = dentistService.findById(id);
        if(dentist.isPresent()){
            return ResponseEntity.ok(dentist.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping
    public Dentist update(@RequestBody Dentist dentist){
        Optional<Dentist> dentistOptional = dentistService.findById(dentist.getId());
        if(dentistOptional.isPresent()){
            return dentistService.save(dentist);
        }else  {
            return dentist;
        }
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id){
        Optional<Dentist> dentistOptional = dentistService.findById(id);
        if(dentistOptional.isPresent()){
            dentistService.delete(id);
            return "Se elimino correctamente";
        }
        else {
            return "No se encontro el dentista";
        }
    }



}
