package bt.gov.rsta.onlinetoken.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.DCRC_CitizenDetailsAPI.DefaultApi;
import org.wso2.client.model.DCRC_CitizenDetailsAPI.CitizenDetailsResponse;
import org.wso2.client.model.DCRC_CitizenDetailsAPI.CitizendetailsObj;

import com.squareup.okhttp.OkHttpClient;

@RestController
@CrossOrigin(origins = { "http://localhost:4200"})
public class ApiController {
	private static String CONSUMER_KEY = "aWgpDx82PyThKpqyDcQWaiVAE34a";
	private static String CONSUMER_SECRET = "fW_OlP2JZkhqWnnaYZeY2ULl7toa";
	
	@RequestMapping("/getcitizendetails/{cidnumber}")
	public ResponseEntity<?> getCitizenDetails(@PathVariable("cidnumber") String cidnumber) throws Exception {
		
		OkHttpClient httpClient = new OkHttpClient();
		httpClient.setConnectTimeout(10000, TimeUnit.MILLISECONDS);
		httpClient.setReadTimeout(10000, TimeUnit.MILLISECONDS);
		
		ApiClient apiClient = new ApiClient();
		apiClient.setHttpClient(httpClient);
		
//		apiClient.setBasePath("https://datahub-apim.dit.gov.bt/dcrc_citizen_details_api/1.0.0");
//		ResponseEntity<Token> token = getApplicationToken();
//		apiClient.setAccessToken(token.getBody().getAccess_token());
		
		apiClient.setBasePath("https://stg-api.dit.gov.bt/dcrc_citizen_details_api/1.0.0");
		apiClient.setAccessToken("1f46a200-22d5-3ec0-943a-39315f5db09f");
	
		DefaultApi api = new DefaultApi(apiClient);
		CitizenDetailsResponse citizenDetailsResponse = api.citizendetailsCidGet(cidnumber);
		CitizendetailsObj citizendetailsObj = null;
		
		if(citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail()!=null && !citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail().isEmpty() ){
			citizendetailsObj = citizenDetailsResponse.getCitizenDetailsResponse().getCitizenDetail().get(0);
			return new ResponseEntity<>(citizendetailsObj, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(citizendetailsObj, HttpStatus.BAD_REQUEST);
		}
		
	}

}
