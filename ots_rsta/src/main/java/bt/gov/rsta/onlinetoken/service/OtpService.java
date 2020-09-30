package bt.gov.rsta.onlinetoken.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinetoken.model.OtpModel;
import bt.gov.rsta.onlinetoken.repository.OtpRepository;

@Service
public class OtpService {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Autowired
	private OtpRepository otpRepository;

	public List<OtpModel> getOtpNumberDb() {
		List<OtpModel> otpModel = new ArrayList<>();
		otpRepository.findAll().forEach(otpModel::add);
		return otpModel;
	}

	public int generateOtpNumber() {
		Random rand = new Random();
		int otpNumber = rand.nextInt((99999 - 100) + 1) + 10;
		return otpNumber;
	}

	public Object saveOtpNumber(OtpModel otpModel) {
		// TODO Auto-generated method stub
		return otpRepository.save(otpModel);
	}

	public Optional<Object> updateVerifiedTime(OtpModel otpModel, int id) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return otpRepository.findById(id).map(x -> {
			x.setVerified_on(timestamp);
			return otpRepository.save(x);
		});
	}

	

	

}
