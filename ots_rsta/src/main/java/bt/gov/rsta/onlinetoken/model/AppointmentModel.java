package bt.gov.rsta.onlinetoken.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_appointment")
public class AppointmentModel {
	@Id
	private int appointment_id;
	private String cid_number;
	private String first_name;
	private String middle_name;
	private String mobile_number;
	private String last_name;
	private String reason;
	private int jusris_id;
	private int juris_type_id;
	private int official_id;
	
	public AppointmentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	public String getCid_number() {
		return cid_number;
	}

	public void setCid_number(String cid_number) {
		this.cid_number = cid_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getJusris_id() {
		return jusris_id;
	}

	public void setJusris_id(int jusris_id) {
		this.jusris_id = jusris_id;
	}

	public int getJuris_type_id() {
		return juris_type_id;
	}

	public void setJuris_type_id(int juris_type_id) {
		this.juris_type_id = juris_type_id;
	}

	public int getOfficial_id() {
		return official_id;
	}

	public void setOfficial_id(int official_id) {
		this.official_id = official_id;
	}
	
	
}
