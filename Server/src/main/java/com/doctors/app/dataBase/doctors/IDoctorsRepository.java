package com.doctors.app.dataBase.doctors;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

interface IDoctorsRepository extends CrudRepository<Doctor, Integer> {
  public Optional<Doctor> findByProfessionalCard(String card); 

  public List<Doctor> findByOffice(String office);

  public List<Doctor> findByHomeCare(Boolean domicile);

  public List<Doctor> findByActive(Boolean active);
}
