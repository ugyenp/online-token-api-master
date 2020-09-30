package bt.gov.rsta.onlinetoken.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import bt.gov.rsta.onlinetoken.model.TokenMasterModel;

public interface TokenMasterRepository extends JpaRepository<TokenMasterModel, Integer> {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Query(value = "select * from t_master_token where juris_id = ?1", nativeQuery = true)
	List<TokenMasterModel> getTokenDetailsByJurisId(int juris_id);
	
	@Query(value = "select * from t_master_token where token_date = ?1", nativeQuery = true)
	TokenMasterModel getTokenDetailsByDate(Date token_date);

}
