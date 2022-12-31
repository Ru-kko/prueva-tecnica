package com.doctors.app.dataBase.patients;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {
  @Autowired  
  private IPatientsRepository repo;
  
  public List<Patient> getAll(){
    return (List<Patient>) repo.findAll();
  }

  public Optional<Patient> getById(Integer id) {
    return repo.findById(id);
  }

  public Optional<Patient> getByIdCard(String professionalCard) {
    return repo.findByIdCard(professionalCard);
  }
}
