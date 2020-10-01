package bt.gov.rsta.onlinetoken.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_generate_token")
public class GenerateTokenModel {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Id
	private int id;
	private String transaction_type;
	private String service_type;
	private String customer_id;
	private String identity_number;
	private int token_no;
	private int token_id;
	private String appointment_time_from;
	private String appointment_time_to;
	
	public GenerateTokenModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getIdentity_number() {
		return identity_number;
	}
	public void setIdentity_number(String identity_number) {
		this.identity_number = identity_number;
	}
	
	public int getToken_no() {
		return token_no;
	}
	public void setToken_no(int token_no) {
		this.token_no = token_no;
	}
	public int getToken_id() {
		return token_id;
	}
	public void setToken_id(int token_id) {
		this.token_id = token_id;
	}
	public String getAppointment_time_from() {
		return appointment_time_from;
	}
	public void setAppointment_time_from(String appointment_time_from) {
		this.appointment_time_from = appointment_time_from;
	}
	public String getAppointment_time_to() {
		return appointment_time_to;
	}
	public void setAppointment_time_to(String appointment_time_to) {
		this.appointment_time_to = appointment_time_to;
	}
	
	
}
