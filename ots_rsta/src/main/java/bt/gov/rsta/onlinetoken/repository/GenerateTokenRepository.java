package bt.gov.rsta.onlinetoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.onlinetoken.model.GenerateTokenModel;

public interface GenerateTokenRepository extends JpaRepository<GenerateTokenModel, Integer> {
	
	@Query(value = "SELECT * FROM t_generate_token g WHERE g.token_no = ?1", nativeQuery = true)
	GenerateTokenModel getTokenDetailsByTokenNo(String token_no);

}