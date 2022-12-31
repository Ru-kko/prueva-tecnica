package com.doctors.app.dataBase.appointments;

import org.springframework.data.repository.CrudRepository;

public interface IAppointmentsRepository extends CrudRepository<Appointment, Integer> {
}
