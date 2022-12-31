package com.doctors.app.dataBase.doctors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctors")
public class Doctor {
  @Id
  @Column(name="DoctorID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idDoctor;

  private String professionalCard;
  private String specialization;
  private Float experience;
  private String office;
  private Boolean homeCare;
  private Boolean active;
  
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Integer getId() {
    return idDoctor;
	}

  public String getProfessionalCard() {
    return professionalCard;
  }

  public void setProfessionalCard(String professionalCard) {
    this.professionalCard = professionalCard;
  }

	public void setId(Integer id) {
		this.idDoctor = id;
	}

  public Boolean attendsAtHome() {
    return homeCare;
  }

  public void setHomeCare(Boolean homeCare) {
    this.homeCare = homeCare;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public Float getExperience() {
    return experience;
  }

  public void setExperience(Float experience) {
    this.experience = experience;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }
}
