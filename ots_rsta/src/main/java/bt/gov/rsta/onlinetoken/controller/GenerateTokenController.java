package bt.gov.rsta.onlinetoken.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import bt.gov.rsta.onlinetoken.model.GenerateTokenModel;
import bt.gov.rsta.onlinetoken.model.MaxTokenModel;
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
	
	@PostMapping("/savetokenDetails")
	public GenerateTokenModel saveTokenDetails(@RequestBody GenerateTokenModel generateTokenModel) {
		return generateTokenModel;
	}
	
	@GetMapping("/getTokenDetails/{token_no}")
	public GenerateTokenModel getTokenDetailsByTokenNo(@PathVariable ("token_no") String token_no) throws Exception{
		if(generateTokenRepository.getTokenDetailsByTokenNo(token_no) != null) {
			return generateTokenRepository.getTokenDetailsByTokenNo(token_no);
		} else {
			throw new Exception(token_no + " is incorrect");
		}
	}
	
	@GetMapping("/getTokenDetails")
	public List<GenerateTokenModel> getTokenDetails(){
		List<GenerateTokenModel>  generateTokenModel = new ArrayList<>();
		generateTokenRepository.findAll().forEach(generateTokenModel::add);
		return generateTokenModel;
	}
	
	@PostMapping("/saveTokenDetails")
	public GenerateTokenModel saveTokenDetail(@RequestBody GenerateTokenModel generateTokenModel) {
		return generateTokenRepository.save(generateTokenModel);
	}
	
	@GetMapping("maxToken/{token_id}/{appointment_time_from}/{appointment_time_to}")
	public @ResponseBody List<MaxTokenModel> getMaxTokenNo(@PathVariable ("token_id") int token_id, @PathVariable ("appointment_time_from") String appointment_time_from, @PathVariable ("appointment_time_to") String appointment_time_to) {
		return generateTokenService.getMaxTokenNumber(token_id,appointment_time_from,appointment_time_to);
	}
	
}
