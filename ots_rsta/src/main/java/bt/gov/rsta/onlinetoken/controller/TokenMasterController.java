package bt.gov.rsta.onlinetoken.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinetoken.model.TokenMasterModel;
import bt.gov.rsta.onlinetoken.repository.TokenMasterRepository;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://172.16.165.156:4200"})
public class TokenMasterController {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Autowired
	private TokenMasterRepository tokenMasterRepository;
	
	@GetMapping("tokendetails/{juris_id}")
	public List<TokenMasterModel> getTokenDetailsByJurisId(@PathVariable ("juris_id") int juris_id) {
		return tokenMasterRepository.getTokenDetailsByJurisId(juris_id);
	}
	
	@GetMapping("tokendate/{token_date}")
	public TokenMasterModel getTokenDate(@PathVariable ("token_date") Date token_date) {
		return tokenMasterRepository.getTokenDetailsByDate(token_date);
	}

}
