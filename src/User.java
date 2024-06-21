public class User extends Address {
	
	private String user_pass;
    private String user_name;
    private String Appointment_day;
    private String Appointment_time;
    private String Appointment_date; 
    private String payment;

    public User( String pass,String name, String A_date, String A_day, String A_time, String pay){
   
    user_pass=pass;
    user_name=name;
    Appointment_day= A_day;
    Appointment_date=A_date;
    Appointment_time=A_time;
    this.payment = pay;

    }

   public User() {
    }
   
   public String getUser_pass() {
       return user_pass;
   }

   public String getUser_name() {
       return user_name;
   }
   
   public String getAppointment_day() {
       return Appointment_day;
   }

   public String getAppointment_time() {
       return Appointment_time;
   }

   public String getAppointment_date() {
       return Appointment_date;
   }
   public String getPayment() {
       return payment;
   }
   
   public void setUser_pass(String user_pass) {
       this.user_pass = user_pass;
   }

   public void setUser_name(String user_name) {
       this.user_name = user_name;
   }
   public void setAppointment_day(String Appointment_day) {
       this.Appointment_day = Appointment_day;
   }

   public void setAppointment_time(String Appointment_time) {
       this.Appointment_time = Appointment_time;
   }

   public void setAppointment_date(String Appointment_date) {
       this.Appointment_date = Appointment_date;
   }
   public void setPayment(String pay) {
   	payment=pay;
   }
   
    @Override
    public String toString() {
        return  "Payment Method: " + payment + "\nAppointment Month: " + Appointment_date +"\nAppointment Day: " 
        		+ Appointment_day + "\nAppointment Time: " + Appointment_time + "\n";
    }
   
}
