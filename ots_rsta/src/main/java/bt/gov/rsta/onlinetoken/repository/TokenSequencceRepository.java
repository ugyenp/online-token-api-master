package bt.gov.rsta.onlinetoken.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.gov.rsta.onlinetoken.model.TokenSequenceModel;

public interface TokenSequencceRepository extends JpaRepository<TokenSequenceModel, Integer> {
	

}