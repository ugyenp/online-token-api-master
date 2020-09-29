package bt.gov.rsta.onlinetoken.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_master_token")
public class TokenMasterModel {
	
	@Id
	private int id;
	private Date token_date;
	private int max_token;
	private int juris_id;
	private int time_slot;
	private Time start_time;
	private Time end_time;
	private Time start_break_time;
	private Time end_break_time;
	
	public TokenMasterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getToken_date() {
		return token_date;
	}

	public void setToken_date(Date token_date) {
		this.token_date = token_date;
	}

	public int getMax_token() {
		return max_token;
	}

	public void setMax_token(int max_token) {
		this.max_token = max_token;
	}

	public int getJuris_id() {
		return juris_id;
	}

	public void setJuris_id(int juris_id) {
		this.juris_id = juris_id;
	}

	public int getTime_slot() {
		return time_slot;
	}

	public void setTime_slot(int time_slot) {
		this.time_slot = time_slot;
	}


	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public Time getStart_break_time() {
		return start_break_time;
	}

	public void setStart_break_time(Time start_break_time) {
		this.start_break_time = start_break_time;
	}

	public Time getEnd_break_time() {
		return end_break_time;
	}

	public void setEnd_break_time(Time end_break_time) {
		this.end_break_time = end_break_time;
	}
	
	

}
