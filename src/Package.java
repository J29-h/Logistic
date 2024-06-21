import java.time.LocalDate;

public class Package extends User{
    private String ID;
    private String Status;
    public Package(String pass, String name, String A_day, String A_time, String A_date, String pay, String id, String status) {
        super( pass, name, A_day, A_time, A_date, pay);
    	this.ID = id;
        this.Status = status;
    }

    public Package() {
    	
    }
    public String getId() {
        return ID;
    }

    public String getStatus() {
        return Status;
    }

 
    public void setid(String id) {
    	ID = id;
    }
    public void setStatus(String status) {
    	Status=status;
    }

   
    
}


