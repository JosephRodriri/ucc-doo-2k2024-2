package claimservice.services;

import claimservice.models.Bills;
import claimservice.models.Claims;
import claimservice.models.Victims;
import claimservice.models.InsuredObjects;

/**
 * @author josep
 * @version 1.0
 * @created 08-nov.-2024 7:49:41 p. m.
 */
@Service
public class ClaimService {

	@Autowired
	EurekaClient eurekaClient;
	private RestTemplate template = new RestTemplate();

	public ClaimService(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param bill
	 */
	public ResponseEntity createBill(Bills bill){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	public ResponseEntity createClaim(Claims claim){
		return null;
	}

	/**
	 * 
	 * @param victim
	 */
	public ResponseEntity createVictim(Victims victim){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	public ResponseEntity deleteBill(Bills bill){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	public ResponseEntity deleteClaim(Claims claim){
		return null;
	}

	/**
	 * 
	 * @param victim
	 */
	public ResponseEntity deleteVictim(Victims victim){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	public ResponseEntity<List> getBills(Claims claim){
		return null;
	}

	/**
	 * 
	 * @param driver
	 */
	public ResponseEntity<List> getClaims(InsuredObjects driver){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	public ResponseEntity<List> getVictims(Bills bill){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	public ResponseEntity updateBill(Bills bill){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	public ResponseEntity updateClaim(Claims claim){
		return null;
	}

	/**
	 * 
	 * @param victim
	 */
	public ResponseEntity updateVictim(Victims victim){
		return null;
	}

}