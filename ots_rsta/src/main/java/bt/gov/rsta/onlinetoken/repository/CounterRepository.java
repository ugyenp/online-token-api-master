package bt.gov.rsta.onlinetoken.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.onlinetoken.model.CounterModel;

public interface CounterRepository extends JpaRepository<CounterModel, Integer>{
	
	@Query(value = "SELECT * FROM t_counter_master WHERE juris_id = ?1", nativeQuery = true)
	List<CounterModel> getCounterDtailsByJurisId(int juris_id);

}
