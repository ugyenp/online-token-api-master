package bt.gov.rsta.onlinetoken.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user_availability")
public class AppointmentTime {
	
	@Id
	private int id;
	private String user_id;
	private String user_name;
	private int official_id;
	private Date unavailable_date;
	private String from_time;
	private String to_time;
	private int juris_type;
	private int juris_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getOfficial_id() {
		return official_id;
	}
	public void setOfficial_id(int official_id) {
		this.official_id = official_id;
	}
	public Date getUnavailable_date() {
		return unavailable_date;
	}
	public void setUnavailable_date(Date unavailable_date) {
		this.unavailable_date = unavailable_date;
	}
	
	public String getFrom_time() {
		return from_time;
	}
	public void setFrom_time(String from_time) {
		this.from_time = from_time;
	}
	public String getTo_time() {
		return to_time;
	}
	public void setTo_time(String to_time) {
		this.to_time = to_time;
	}
	public int getJuris_type() {
		return juris_type;
	}
	public void setJuris_type(int juris_type) {
		this.juris_type = juris_type;
	}
	public int getJuris_id() {
		return juris_id;
	}
	public void setJuris_id(int juris_id) {
		this.juris_id = juris_id;
	}
	
	 
}
