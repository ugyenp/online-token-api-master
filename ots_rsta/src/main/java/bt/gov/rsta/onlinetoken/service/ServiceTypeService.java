package bt.gov.rsta.onlinetoken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinetoken.model.ServicesTypeModel;
import bt.gov.rsta.onlinetoken.repository.ServiceTypeRepository;

@Service
public class ServiceTypeService {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */

	@Autowired
	private ServiceTypeRepository serviceTypeRepository;
	
	public ServicesTypeModel getServiceId(int id) {
		return serviceTypeRepository.findById(id).get();
	}

	public List<ServicesTypeModel> getServices() {
		List<ServicesTypeModel> servicesTypeModel = new ArrayList<>();
		serviceTypeRepository.findAll().forEach(servicesTypeModel::add);
		return servicesTypeModel;
	}

}
