package bt.gov.rsta.onlinetoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.gov.rsta.onlinetoken.model.AppointmentTime;

public interface AppointmentTimeRepository extends JpaRepository<AppointmentTime, Integer> {

}
