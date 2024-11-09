package claimservice.models;


/**
 * @author josep
 * @version 1.0
 * @created 08-nov.-2024 7:49:41 p. m.
 */
public class Claims {

	private Date claimDate;
	private String claimDescription;
	private Integer claimId;
	private String claimType;
	private String eventPlace;
	private String lastStatusUpdate;
	private Integer policyId;
	private String status;



	public void finalize() throws Throwable {

	}

	public Claims(){

	}

	/**
	 * 
	 * @param id
	 * @param policyId
	 * @param status
	 * @param claimType
	 * @param claimDescription
	 * @param claimDate
	 * @param lastStatusUpdate
	 * @param eventPlace
	 */
	public Claims(Integer id, Integer policyId, String status, String claimType, String claimDescription, Date claimDate, String lastStatusUpdate, String eventPlace){

	}

	public Date getClaimDate(){
		return null;
	}

	public String getClaimDescription(){
		return "";
	}

	public Integer getClaimId(){
		return 0;
	}

	public String getClaimType(){
		return "";
	}

	public String getEventPlace(){
		return "";
	}

	public String getLastStatusUpdate(){
		return "";
	}

	public Integer getPolicyId(){
		return 0;
	}

	public String getStatus(){
		return "";
	}

	/**
	 * 
	 * @param claimDate
	 */
	public void setClaimDate(Date claimDate){

	}

	/**
	 * 
	 * @param claimDescription
	 */
	public void setClaimDescription(String claimDescription){

	}

	/**
	 * 
	 * @param claimId
	 */
	public void setClaimId(Integer claimId){

	}

	/**
	 * 
	 * @param claimType
	 */
	public void setClaimType(String claimType){

	}

	/**
	 * 
	 * @param eventPlace
	 */
	public void setEventPlace(String eventPlace){

	}

	/**
	 * 
	 * @param lastStatusUpdate
	 */
	public void setLastStatusUpdate(String lastStatusUpdate){

	}

	/**
	 * 
	 * @param policyId
	 */
	public void setPolicyId(Integer policyId){

	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status){

	}

}