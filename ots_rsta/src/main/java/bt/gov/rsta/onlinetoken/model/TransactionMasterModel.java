package bt.gov.rsta.onlinetoken.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "t_transaction_master")
public class TransactionMasterModel {
	
	/*
	 * Author: Ugyen Penjor 
	 * Designation: Software Engineer 
	 * NGN Technologies Pvt Ltd @ 2020
	 */
	
	@Id
	private int id;
	private String transaction_type;
	
	@OneToMany(targetEntity = ServicesTypeModel.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "transaction_id",referencedColumnName = "id")
	  private List<ServicesTypeModel> serviceJoin;
	
	
	public TransactionMasterModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TransactionMasterModel(int id, String transaction_type, List<ServicesTypeModel> serviceJoin) {
		super();
		this.id = id;
		this.transaction_type = transaction_type;
		this.serviceJoin = serviceJoin;
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


	public List<ServicesTypeModel> getServiceJoin() {
		return serviceJoin;
	}


	public void setServiceJoin(List<ServicesTypeModel> serviceJoin) {
		this.serviceJoin = serviceJoin;
	}

	

}
