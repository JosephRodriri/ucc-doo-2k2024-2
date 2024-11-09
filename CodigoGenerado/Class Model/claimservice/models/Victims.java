package claimservice.models;


/**
 * @author josep
 * @version 1.0
 * @created 08-nov.-2024 7:49:41 p. m.
 */
public class Victims {

	private String address;
	private Date birthDate;
	private String name;
	private String pesel;
	private BigInteger phoneNum;
	private Integer victimId;

	public Victims(){

	}

	public void finalize() throws Throwable {

	}

	public String getAddress(){
		return "";
	}

	public Date getBirthDate(){
		return null;
	}

	public String getName(){
		return "";
	}

	public String getPesel(){
		return "";
	}

	public BigInteger getPhoneNum(){
		return null;
	}

	public Integer getVictimId(){
		return 0;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address){

	}

	/**
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate){

	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name){

	}

	/**
	 * 
	 * @param pesel
	 */
	public void setPesel(String pesel){

	}

	/**
	 * 
	 * @param phoneNum
	 */
	public void setPhoneNum(BigInteger phoneNum){

	}

	/**
	 * 
	 * @param victimId
	 */
	public void setVictimId(Integer victimId){

	}

}