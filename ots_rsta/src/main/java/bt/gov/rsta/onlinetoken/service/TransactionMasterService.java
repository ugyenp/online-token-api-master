package bt.gov.rsta.onlinetoken.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.rsta.onlinetoken.model.TransactionMasterModel;
import bt.gov.rsta.onlinetoken.repository.TransactionMasterRepository;

@Service
public class TransactionMasterService {

	@Autowired
	private TransactionMasterRepository transactionMasterRepository;
	
	public List<TransactionMasterModel> getAllTransactiontype() {
		List<TransactionMasterModel> transactionMasterModel = new ArrayList<>();
		transactionMasterRepository.findAll().forEach(transactionMasterModel::add);
		return transactionMasterModel;
	}

	public TransactionMasterModel getAllServiceBasedOnTransactionId(int id) {
		return transactionMasterRepository.findById(id).get();
	}

}
