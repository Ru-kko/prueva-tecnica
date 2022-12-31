package com.doctors.app.dataBase.patients;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

interface IPatientsRepository extends CrudRepository<Patient, Integer> {
  public Optional<Patient> findByIdCard(String idCard);
}