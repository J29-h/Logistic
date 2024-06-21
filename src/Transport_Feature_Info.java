
public class Transport_Feature_Info {
	String vehicle_ID;
    String vehicle_Name;
    String hours;
    String capacity;
    String condition;
    
    public Transport_Feature_Info(String vehicle_ID, String vehicle_Name, String capacity, String hours, String condition) {
    	
    	 this.vehicle_ID = vehicle_ID;
         this.vehicle_Name = vehicle_Name;
         this.hours = hours;
         this.capacity = capacity;
         this.condition = condition;
    }
    public Transport_Feature_Info(){}

    public void setVehicle_ID(String vehicle_ID) {
        this.vehicle_ID = vehicle_ID;
    }

    public void setVehicle_Name(String vehicle_Name) {
        this.vehicle_Name = vehicle_Name;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setcapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getVehicle_ID() {
        return vehicle_ID;
    }

    public String getVehicle_Name() {
        return vehicle_Name;
    }

    public String getHours() {
        return hours;
    }

    public String getcapacity() {
        return capacity;
    }

    public String getcondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Transport Feature Information:"+ "\nVehicle ID: " + vehicle_ID 
        		+ "\nVehicle Name: " + vehicle_Name + "\nHours: " + hours 
        		+ "\nCapacity: " + capacity + "\nCondition: " + condition + "\n";
    }
}
