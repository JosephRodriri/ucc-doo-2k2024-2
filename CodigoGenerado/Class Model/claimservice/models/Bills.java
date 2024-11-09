package claimservice.models;


/**
 * @author josep
 * @version 1.0
 * @created 08-nov.-2024 7:49:41 p. m.
 */
public class Bills {

	private Double amountOfWithdraw;
	private Double billAmount;
	private String billStatus;
	private Integer claimId;
	private Integer victimId;



	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param claimId
	 * @param billStatus
	 * @param billAmount
	 * @param amountOfWithdraw
	 * @param victimId
	 */
	public Bills(Integer claimId, String billStatus, Double billAmount, Double amountOfWithdraw, Integer victimId){

	}

	public Bills(){

	}

	public Double getAmountOfWithdraw(){
		return 0;
	}

	public Double getBillAmount(){
		return 0;
	}

	public String getBillStatus(){
		return "";
	}

	public Integer getClaimId(){
		return 0;
	}

	public Integer getVictimId(){
		return 0;
	}

	/**
	 * 
	 * @param amountOfWithdraw
	 */
	public void setAmountOfWithdraw(Double amountOfWithdraw){

	}

	/**
	 * 
	 * @param billAmount
	 */
	public void setBillAmount(Double billAmount){

	}

	/**
	 * 
	 * @param billStatus
	 */
	public void setBillStatus(String billStatus){

	}

	/**
	 * 
	 * @param claimId
	 */
	public void setClaimId(Integer claimId){

	}

	/**
	 * 
	 * @param victimId
	 */
	public void setVictimId(Integer victimId){

	}

}