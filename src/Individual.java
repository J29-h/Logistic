
public class Individual extends User{
	  String individual_id ;
	    
	  public Individual(String pass, String name, String A_date, String A_day, String A_time, String pay, String id ) {
	        super(pass, name, A_date, A_day, A_time, pay);
	        individual_id=id;
	    }
	    
	    public Individual(){}
	    
	    
	    public String getIndividual_id() {
	        return individual_id;
	    }

	    public void setIndividual_id(String  individual_id) {
	        this.individual_id = individual_id;
	    }
}
