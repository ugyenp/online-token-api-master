package bt.gov.rsta.onlinetoken.controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinetoken.model.GeneratedTokenModel;
import bt.gov.rsta.onlinetoken.model.MaxTokenModel;
import bt.gov.rsta.onlinetoken.model.TokenDetails;
import bt.gov.rsta.onlinetoken.repository.GenerateTokenRepository;
import bt.gov.rsta.onlinetoken.service.GenerateTokenService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://172.16.165.156:4200"})
public class GenerateTokenController {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Autowired
	private GenerateTokenRepository generateTokenRepository; 
	
	@Autowired
	private GenerateTokenService generateTokenService;
	
//	@PostMapping("/savetokenDetails")
//	public GenerateTokenModel saveTokenDetails(@RequestBody GenerateTokenModel generateTokenModel) {
//		return generateTokenRepository.save(generateTokenModel);
//	}
	
	@GetMapping("/getTokenDetails/{token_no}")
	public List<GeneratedTokenModel> getTokenDetailsByTokenNo(@PathVariable ("token_no") String token_no) throws Exception{
		if(generateTokenRepository.getTokenDetailsByTokenNo(token_no) != null) {
			return generateTokenRepository.getTokenDetailsByTokenNo(token_no);
		} else {
			throw new Exception(token_no + " is incorrect");
		}
	}
	
	@GetMapping("/getTokenDetails")
	public List<GeneratedTokenModel> getTokenDetails(){
		List<GeneratedTokenModel>  generatedTokenModel = new ArrayList<>();
		generateTokenRepository.findAll().forEach(generatedTokenModel::add);
		return generatedTokenModel;
	}
	
	@PostMapping("/saveTokenDetails")
	public GeneratedTokenModel saveTokenDetail(@RequestBody GeneratedTokenModel generatedTokenModel) {
		return generateTokenRepository.save(generatedTokenModel);
	}
	
	@GetMapping("maxToken/{token_id}/{appointment_time_from}/{appointment_time_to}")
	public @ResponseBody List<MaxTokenModel> getMaxTokenNo(@PathVariable ("token_id") int token_id, @PathVariable ("appointment_time_from") String appointment_time_from, @PathVariable ("appointment_time_to") String appointment_time_to) {
		return generateTokenService.getMaxTokenNumber(token_id,appointment_time_from,appointment_time_to);
	}
	
	@GetMapping("drivingLicenseTokenView/{transaction_type}/{service_type}/{identity_number}")
	public List<GeneratedTokenModel> viewTokenByDrvingLicense(@PathVariable ("transaction_type") String transaction_type, @PathVariable ("service_type") String service_type, @PathVariable ("identity_number") String identity_number) {
		return generateTokenRepository.viewTokenByDrvingLicense(transaction_type,service_type,identity_number);
	}
	
	@PostMapping("/savetokenDetails")
	public GeneratedTokenModel saveGeneratedTokenDetails(@RequestBody List<TokenDetails> tokenDetails) {
		for(int i = 0; i < tokenDetails.size(); i++) {
			GeneratedTokenModel token = new GeneratedTokenModel();
			token.setToken_id(tokenDetails.get(i).getToken_id());
			token.setToken_no(tokenDetails.get(i).getToken_no());
			token.setAppointment_time_from(tokenDetails.get(i).getAppointment_time_from());
			token.setAppointment_time_to(tokenDetails.get(i).getAppointment_time_to());
			token.setCustomer_id(tokenDetails.get(i).getCustomer_id());
			token.setIdentity_number(tokenDetails.get(i).getIdentity_number());
			token.setService_type(tokenDetails.get(i).getService_type());
			token.setIdentity_type(tokenDetails.get(i).getIdentity_type());
			token.setService(tokenDetails.get(i).getService());
			generateTokenRepository.save(token);
		}
		return null;
	}
	
}
