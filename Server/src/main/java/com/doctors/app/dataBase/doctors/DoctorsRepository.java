package com.doctors.app.dataBase.doctors;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorsRepository {
  @Autowired
  private IDoctorsRepository repo;

  public List<Doctor> getAll(){
    return (List<Doctor>) repo.findAll();
  }

  public Optional<Doctor> getDoctorByID(Integer id) {
    return repo.findById(id);
  }

  public Optional<Doctor> getByProfessionalCard(String professionalCard) {
    return repo.findByProfessionalCard(professionalCard);
  }

  public List<Doctor> getByOffice(String office){
    return repo.findByOffice(office);
  }

  public List<Doctor> getHomeCareDoctors(){
    return repo.findByHomeCare(true);
  }

  public List<Doctor> getActiveDoctors(){
    return repo.findByActive(true);
  }
}
