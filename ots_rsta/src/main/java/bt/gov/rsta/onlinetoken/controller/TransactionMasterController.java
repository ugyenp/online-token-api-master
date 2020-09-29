package bt.gov.rsta.onlinetoken.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.rsta.onlinetoken.model.TransactionMasterModel;
import bt.gov.rsta.onlinetoken.service.TransactionMasterService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://172.16.165.156:4200"})
public class TransactionMasterController {

	@Autowired
	private TransactionMasterService transactionMasterService;
	
	@RequestMapping(value = "/get-transaction", method = RequestMethod.GET )
	public List<TransactionMasterModel> getAllTransactiontype(){
		return transactionMasterService.getAllTransactiontype();
	}
	
	@RequestMapping(value = "/get-services/{id}", method = RequestMethod.GET )
	public TransactionMasterModel getAllServiceBasedOnTransactionId(@PathVariable int id){
		return transactionMasterService.getAllServiceBasedOnTransactionId(id);
	}
}
