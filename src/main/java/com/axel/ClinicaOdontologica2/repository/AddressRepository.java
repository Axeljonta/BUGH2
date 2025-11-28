package com.axel.ClinicaOdontologica2.repository;

import com.axel.ClinicaOdontologica2.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {


}
