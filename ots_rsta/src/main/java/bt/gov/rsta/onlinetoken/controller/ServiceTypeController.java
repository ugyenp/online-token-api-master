package bt.gov.rsta.onlinetoken.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinetoken.model.AppointmentModel;
import bt.gov.rsta.onlinetoken.model.AppointmentTime;
import bt.gov.rsta.onlinetoken.model.OfficialMasterModel;
import bt.gov.rsta.onlinetoken.model.ServicesTypeModel;
import bt.gov.rsta.onlinetoken.model.CounterModel;
import bt.gov.rsta.onlinetoken.repository.AppointmentRepository;
import bt.gov.rsta.onlinetoken.repository.AppointmentTimeRepository;
import bt.gov.rsta.onlinetoken.repository.OfficialMasterRepository;
import bt.gov.rsta.onlinetoken.repository.CounterRepository;
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
	
	@Autowired
	private OfficialMasterRepository officialMasterRepository;
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private CounterRepository counterRepository;
	
	@Autowired
	private AppointmentTimeRepository appointmentTimeRepository;
	
	
	@RequestMapping(value = "/get-service-id/{id}", method = RequestMethod.GET)
	public ServicesTypeModel getServiceId(@PathVariable int id) {
		return serviceTypeService.getServiceId(id);
	}
	
	@RequestMapping(value = "/get-services", method = RequestMethod.GET)
	public List<ServicesTypeModel> getServices() {
		return serviceTypeService.getServices();
	}
	
	@RequestMapping(value = "/getOfficial", method = RequestMethod.GET)
	public List<OfficialMasterModel> getOfficialList() {
		List<OfficialMasterModel> officialMasterModel = new ArrayList<>();
		officialMasterRepository.findAll().forEach(officialMasterModel::add);
		return officialMasterModel;
	}
	
	@RequestMapping(value = "/getAppointmetDetails", method = RequestMethod.GET)
	public List<AppointmentModel> getAppointmentDetails() {
		List<AppointmentModel> appointmentModel = new ArrayList<>();
		appointmentRepository.findAll().forEach(appointmentModel::add);
		return appointmentModel;
	}
	
	@PostMapping("/makeAppointment")
	public AppointmentModel makeAppointment(@RequestBody AppointmentModel appointmentModel) {
		return appointmentRepository.save(appointmentModel);
	}
	
	@RequestMapping(value = "/getCounterDetails", method = RequestMethod.GET)
	public List<CounterModel> getCounterDetails() {
		List<CounterModel> counterModel = new ArrayList<>();
		counterRepository.findAll().forEach(counterModel::add);
		return counterModel;
	}
	
	@GetMapping("/getCounterDetailsByJurisId/{juris_id}")
	public List<CounterModel> getCounterDetailsByJuridId(@PathVariable ("juris_id") int juris_id){
		return counterRepository.getCounterDtailsByJurisId(juris_id);
	}
	
	@GetMapping("/appointmentTime")
	private List<AppointmentTime> getAppointmentTime(){
		List<AppointmentTime> appointmentTime = new ArrayList<AppointmentTime>();
		appointmentTimeRepository.findAll().forEach(appointmentTime::add);
		return appointmentTime;
	}
}
