package bt.gov.rsta.onlinetoken.model;

public class CustomerDetailsEntity {

	private String identity_type;
	private String customer_id;
	private String identity_number;
	private String service_type;
	private String service;
	
	public CustomerDetailsEntity() {
		super();
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
