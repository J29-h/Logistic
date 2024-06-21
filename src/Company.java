
public class Company extends User{

    private String CRN;

    public Company( String pass, String name, String A_day, String A_time, String A_date, String pay, String CommercialRegistrationNo) {
        super( pass, name, A_day, A_time, A_date, pay);
        this.CRN= CommercialRegistrationNo;
    }
    
    
	  public Company() {
	}


	public void setCRN(String CRN) {
	        this.CRN = CRN;
	    }

	    public String getCRN() {
	        return CRN;
	    }
}
