package bt.gov.rsta.onlinetoken.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinetoken.model.OtpModel;
import bt.gov.rsta.onlinetoken.service.OtpService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://172.16.165.156:4200"})
public class OtpController {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Autowired
	private OtpService otpService;
	
	@RequestMapping(value = "/get-otp-number", method = RequestMethod.GET)
	public List<OtpModel> getOtpNumberDb(){
		return otpService.getOtpNumberDb();
	}
	
	@RequestMapping(value = "/generate-otp", method = RequestMethod.GET)
	public int generateOtpNumber(){
		return otpService.generateOtpNumber();
	}
	
	@RequestMapping(value = "/save-otp-number", method = RequestMethod.POST)
	public void saveOtpNumber(@RequestBody OtpModel otpModel){
		 otpService.saveOtpNumber(otpModel);
	}
	
	@RequestMapping(value = "/update-verified/{id}", method = RequestMethod.PUT)
	public Optional<Object> updateVerifiedTime(@RequestBody OtpModel otpModel, @PathVariable ("id") int id){
		
		return otpService.updateVerifiedTime(otpModel,id);
	}

}
