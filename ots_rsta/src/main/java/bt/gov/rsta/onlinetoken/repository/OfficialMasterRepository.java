package bt.gov.rsta.onlinetoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.gov.rsta.onlinetoken.model.OfficialMasterModel;

public interface OfficialMasterRepository extends JpaRepository<OfficialMasterModel, Integer> {

}
