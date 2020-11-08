package bt.gov.rsta.onlinetoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.gov.rsta.onlinetoken.model.AppointmentModel;

public interface AppointmentRepository extends JpaRepository<AppointmentModel, Integer> {
	
	
}
