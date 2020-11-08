package bt.gov.rsta.onlinetoken.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rsta_official_master")
public class OfficialMasterModel {
	@Id
	private int official_id;
	private String designation;
	
	public OfficialMasterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOfficial_id() {
		return official_id;
	}

	public void setOfficial_id(int official_id) {
		this.official_id = official_id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
