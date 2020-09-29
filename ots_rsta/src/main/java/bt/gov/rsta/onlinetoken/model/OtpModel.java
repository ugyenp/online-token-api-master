package bt.gov.rsta.onlinetoken.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_otp")
public class OtpModel {
	
	@Id
	private int id;
	private int otp_number;
	private String phone_number;
	private String cid_number;
	private Timestamp verified_on; 
	
	
	public OtpModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OtpModel(int id, int otp_number, String phone_number, String cid_number, Timestamp verified_on) {
		super();
		this.id = id;
		this.otp_number = otp_number;
		this.phone_number = phone_number;
		this.cid_number = cid_number;
		this.verified_on = verified_on;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getOtp_number() {
		return otp_number;
	}


	public void setOtp_number(int otp_number) {
		this.otp_number = otp_number;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public String getCid_number() {
		return cid_number;
	}


	public void setCid_number(String cid_number) {
		this.cid_number = cid_number;
	}


	public Timestamp getVerified_on() {
		return verified_on;
	}


	public void setVerified_on(Timestamp verified_on) {
		this.verified_on = verified_on;
	}


	
}
