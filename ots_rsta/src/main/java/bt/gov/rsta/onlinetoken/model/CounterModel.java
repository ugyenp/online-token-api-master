package bt.gov.rsta.onlinetoken.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_counter_master")
public class CounterModel {
	
	@Id
	private int id;
	private int counter_no;
	private int user_id;
	private int juris_id;
	private String name;
	
	public CounterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCounter_no() {
		return counter_no;
	}

	public void setCounter_no(int counter_no) {
		this.counter_no = counter_no;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getJuris_id() {
		return juris_id;
	}

	public void setJuris_id(int juris_id) {
		this.juris_id = juris_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
