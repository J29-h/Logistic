
public class Total extends User{

	String Total;
	
	public Total( String pass, String name, String A_day, String A_time, String A_date, String pay, String total) {
        super( pass, name, A_day, A_time, A_date, pay);
        this.Total= total;
    }
	
	 public Total() {
		}


		public void setTotal(String total) {
		        this.Total = total;
		    }

		    public String getTotal() {
		        return Total;
		    }
}
