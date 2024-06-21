
public class Customer {

	String username;
    String password;
    String f_name;
    String l_name;
    String email;
    

    public Customer(){
}


public Customer(String username, String password, String f_name, String l_name, String email) {
this.username = username;
this.password = password;
this.f_name = f_name;
this.l_name = l_name;
this.email = email;
}

public String getUsername() {
    return username;
}
public String getPassword() {
    return password;
}
public String getf_name() {
    return f_name;
}
public String getl_name() {
    return l_name;
}
public String getemail() {
    return email;
}
public void setUsername(String username) {
    this.username = username;
}

public void setPassword(String password) {
    this.password = password;
}
public void setf_name(String f_name) {
    this.f_name = f_name;
}
public void setl_name(String l_name) {
    this.l_name = l_name;
}
public void setemail(String email) {
    this.email = email;
}

}
