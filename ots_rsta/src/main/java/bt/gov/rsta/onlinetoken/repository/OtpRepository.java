package bt.gov.rsta.onlinetoken.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.rsta.onlinetoken.model.OtpModel;

@Repository
public interface OtpRepository extends CrudRepository<OtpModel, Integer> {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */

}
