package com.doctors.app.dataBase.appointments;

import com.doctors.app.dataBase.doctors.Doctor;
import com.doctors.app.dataBase.patients.Patient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "appointments")
public class Appointment {
  @Id
  @Column(name = "appointmentId")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer appointmentId;

  @Temporal(TemporalType.TIMESTAMP)
  private Appointment appointmentDate;
  @ManyToOne
  private Patient patient;
  @ManyToOne 
  private Doctor doctor;


  public Doctor getDoctor() {
    return doctor;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Appointment getAppointmentDate() {
    return appointmentDate;
  }

  public void setAppointmentDate(Appointment appointmentDate) {
    this.appointmentDate = appointmentDate;
  }

  public Integer getDateId() {
    return appointmentId;
  }

  public void setAppointmentId(Integer appointmentId) {
    this.appointmentId = appointmentId;
  }
}
