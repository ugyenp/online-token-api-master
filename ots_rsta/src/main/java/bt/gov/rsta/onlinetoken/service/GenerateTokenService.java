package bt.gov.rsta.onlinetoken.service;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import bt.gov.rsta.onlinetoken.model.MaxTokenModel;

@Service
public class GenerateTokenService {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@SuppressWarnings("unchecked")
	public List<MaxTokenModel> getMaxTokenNumber(int token_id, String appointment_time_from, String appointment_time_to){
		
		List<MaxTokenModel> maxTokenModel = new ArrayList<MaxTokenModel>();
		String queryStr = "SELECT MAX(a.token_no) maximumTokenNo "
				+ "FROM t_generate_token a "
				+ "WHERE a.`token_id` = ?1  AND "
				+ "a.`appointment_time_from` = ?2 AND "
				+ "a.`appointment_time_to` = ?3";
	
			Query query = entityManager.createNativeQuery(queryStr);
			query.setParameter(1, token_id);
			query.setParameter(2, appointment_time_from);
			query.setParameter(3, appointment_time_to);
			//maxTokenModel = (List<MaxTokenModel>)query.getResultList(); 
			
		
		return query.getResultList(); 

	}

}
