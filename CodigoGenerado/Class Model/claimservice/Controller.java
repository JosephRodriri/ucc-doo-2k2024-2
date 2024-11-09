package claimservice;

import claimservice.services.ClaimService;
import claimservice.models.Bills;
import claimservice.models.Claims;
import claimservice.models.Victims;
import claimservice.models.InsuredObjects;

/**
 * @author josep
 * @version 1.0
 * @created 08-nov.-2024 7:49:41 p. m.
 */
@RestController@CrossOrigin(origins = "*")
public class Controller {

	@Autowired
	private ClaimService claimService;

	public Controller(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param bill
	 */
	@PostMapping("/createbill")@ResponseBody
	public ResponseEntity createBill(@RequestBody Bills bill){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	@PostMapping("/createclaim")@ResponseBody
	public ResponseEntity createClaim(@RequestBody Claims claim){
		return null;
	}

	/**
	 * 
	 * @param victim
	 */
	@PostMapping("/createvictim")@ResponseBody
	public ResponseEntity createvictim(@RequestBody Victims victim){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	@PostMapping("/deleteclaim")@ResponseBody
	public ResponseEntity deleteClaim(@RequestBody Claims claim){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	@PostMapping("/deletebill")@ResponseBody
	public ResponseEntity deleteClaim(@RequestBody Bills bill){
		return null;
	}

	/**
	 * 
	 * @param victim
	 */
	@PostMapping("/deletevictim")@ResponseBody
	public ResponseEntity deleteVictim(@RequestBody Victims victim){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	@PostMapping("/getbills")@ResponseBody
	public ResponseEntity<List> getBills(@RequestBody Claims claim){
		return null;
	}

	/**
	 * 
	 * @param driver
	 */
	@PostMapping("/getclaims")@ResponseBody
	public ResponseEntity<List> getClaims(@RequestBody InsuredObjects driver){
		return null;
	}

	@GetMapping("/serviceStatus")@ResponseBody
	public ResponseEntity getStatus(){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	@PostMapping("/getvictims")@ResponseBody
	public ResponseEntity<List> getVictims(@RequestBody Bills bill){
		return null;
	}

	/**
	 * 
	 * @param bill
	 */
	@PostMapping("/updatebill")@ResponseBody
	public ResponseEntity updateBill(@RequestBody Bills bill){
		return null;
	}

	/**
	 * 
	 * @param claim
	 */
	@PostMapping("/updateclaim")@ResponseBody
	public ResponseEntity updateClaim(@RequestBody Claims claim){
		return null;
	}

	/**
	 * 
	 * @param victim
	 */
	@PostMapping("/updatevictim")@ResponseBody
	public ResponseEntity updateVictim(@RequestBody Victims victim){
		return null;
	}

}