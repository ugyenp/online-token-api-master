package bt.gov.rsta.onlinetoken.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bt.gov.rsta.onlinetoken.model.GeneratedTokenModel;

public interface GenerateTokenRepository extends JpaRepository<GeneratedTokenModel, Integer> {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Query(value = "SELECT * FROM t_generate_token g WHERE g.token_no = ?1", nativeQuery = true)
	List<GeneratedTokenModel> getTokenDetailsByTokenNo(String token_no);
	
	@Query(value = "SELECT * FROM t_generate_token WHERE transaction_type=?1 AND service_type = ?2 AND identity_number = ?3", nativeQuery = true)
	List<GeneratedTokenModel> viewTokenByDrvingLicense(String transaction_type, String service_type,
			String identity_number);
	
}
