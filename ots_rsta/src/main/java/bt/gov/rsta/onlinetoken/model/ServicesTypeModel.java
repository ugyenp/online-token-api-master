package bt.gov.rsta.onlinetoken.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_services_master")
public class ServicesTypeModel {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Id
	private int id;
	private String services_type;
	private int transaction_id;
	
	
	public ServicesTypeModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ServicesTypeModel(int id, String services_type, int transaction_id) {
		super();
		this.id = id;
		this.services_type = services_type;
		this.transaction_id = transaction_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getServices_type() {
		return services_type;
	}


	public void setServices_type(String services_type) {
		this.services_type = services_type;
	}


	public int getTransaction_id() {
		return transaction_id;
	}


	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	
	
}
