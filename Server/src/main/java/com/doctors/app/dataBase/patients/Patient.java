package com.doctors.app.dataBase.patients;

import java.util.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Patients")
public class Patient {
  @Id
  @Column(name="PatientID")
  private Integer idPatient;
  
  @Temporal(TemporalType.DATE)
  private Date bornDate;
  private String names; 
  private String surNames;
  private String idCard;
  private Double monthlyValue;
  private Boolean inTreatment;
  
  // Auth
  @NonNull
  private String pws;
  private boolean admin;

  public boolean isAdmin() {
    return admin;
  }

  public void setAdmin(boolean admin) {
    this.admin = admin;
  }

  public String getPws() {
    return pws;
  }

  public void setPws(String pws) {
    this.pws = pws;
  }

  public Boolean getInTreatment() {
    return inTreatment;
  }

  public void setInTreatment(Boolean inTreatment) {
    this.inTreatment = inTreatment;
  }

  public Double getMonthlyValue() {
    return monthlyValue;
  }

  public void setMonthlyValue(Double monthlyValue) {
    this.monthlyValue = monthlyValue;
  }

  public String getId() {
    return idCard;
  }

  public void setId(String idCard) {
    this.idCard = idCard;
  }

  public Date getBornDate() {
    return bornDate;
  }

  public void setBornDate(Date bornDate) {
    this.bornDate = bornDate;
  }

  public String getSurNames() {
    return surNames;
  }

  public void setSurNames(String surNames) {
    this.surNames = surNames;
  }

  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public Integer getIdPatient() {
    return idPatient;
  }

  public void setIdPatient(Integer idPatient) {
    this.idPatient = idPatient;
  }
}