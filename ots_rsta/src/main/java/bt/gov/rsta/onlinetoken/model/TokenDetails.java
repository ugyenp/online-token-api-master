package bt.gov.rsta.onlinetoken.model;

import java.sql.Time;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import bt.gov.rsta.onlinetoken.deserializer.SqlTimeDeserializer;

public class TokenDetails {
	
	private int token_no;
	private int token_id;
	@JsonFormat(pattern = "HH:mm")
	@JsonDeserialize(using = SqlTimeDeserializer.class)
	private Time appointment_time_from;
	@JsonFormat(pattern = "HH:mm")
	@JsonDeserialize(using = SqlTimeDeserializer.class)
	private Time appointment_time_to;
	private String identity_type;
	private String customer_id;
	private String identity_number;
	private String service_type;
	private String service;
	
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
	public Time getAppointment_time_from() {
		return appointment_time_from;
	}
	public void setAppointment_time_from(Time appointment_time_from) {
		this.appointment_time_from = appointment_time_from;
	}
	public Time getAppointment_time_to() {
		return appointment_time_to;
	}
	public void setAppointment_time_to(Time appointment_time_to) {
		this.appointment_time_to = appointment_time_to;
	}
	public String getIdentity_type() {
		return identity_type;
	}

	
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void setIdentity_type(String identity_type) {
		this.identity_type = identity_type;
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

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}	
}
