
public class Address {

	private String street;
    
    private String city;
    
    private String state;
    
    private String zip;
  
    public Address(String state, String city, String street, String zip)
    {
        street = street; 
        city = city;
        state = state;
        zip = zip;
    }
   public Address(){}

public String getState() {
	    return state;
}

public void setState(String state) {
	    this.state = state;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public String getStreet() {
    return street;
}

public void setStreet(String street) {
    this.street = street;
}

public String getZip() {
    return zip;
}

public void setZip(String zip) {
    this.zip = zip;
}
    /**
    The toString method
    @return Information about the address.
    */
    public String toString()
    {
        return ("State: "+ state + "\nCity: " + city +
         "\nStreet: "+street + "\nZip Code: "+ zip+"\n");
    }

    
}
