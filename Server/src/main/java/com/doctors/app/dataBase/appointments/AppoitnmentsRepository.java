package com.doctors.app.dataBase.appointments;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppoitnmentsRepository {
  @Autowired
  private IAppointmentsRepository repo;

  public List<Appointment> getAll() {
    return (List<Appointment>) repo.findAll();
  }

  public Optional<Appointment> getDoctorByID(Integer id) {
    return repo.findById(id);
  }
}
