package bt.gov.rsta.onlinetoken.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinetoken.model.ServicesTypeModel;
import bt.gov.rsta.onlinetoken.service.ServiceTypeService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "*"})
public class ServiceTypeController {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Autowired
	private ServiceTypeService serviceTypeService;
	
	@RequestMapping(value = "/get-service-id/{id}", method = RequestMethod.GET)
	public ServicesTypeModel getServiceId(@PathVariable int id) {
		return serviceTypeService.getServiceId(id);
	}
	
	@RequestMapping(value = "/get-services", method = RequestMethod.GET)
	public List<ServicesTypeModel> getServices() {
		return serviceTypeService.getServices();
	}
	
}
