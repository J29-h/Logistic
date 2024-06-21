import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

	public static void main(String[] args) throws IOException {

		Scanner read = new Scanner (System.in);
		
		System.out.println("\t\tWelcome To Logistics");
		System.out.println("\tPackage Delivering & Tracking System");
		System.out.println("   _______________________________________________");
		int Choice1;
		
		
		File file = new File ("Usres.txt");
		String filePath = "/Users/ging3r/eclipse-workspace/Delivery_System/Tracking.txt";

		if (!file.exists()) {
			
			file.createNewFile();
		}			
		
		do {
			System.out.println("\t\t1- Log In...");
			System.out.println("\t\t2- Register...");
			System.out.println("\t\t3- Exit...");
			
			Choice1 = read.nextInt();
			
			switch(Choice1) {
			
			case 1:
				
				login(file,read);
				
				break;
				
			case 2:
				
				register(file,read);

				break;
				
			case 3:
				 	
				
				break;
				
			default:
				System.out.println("\tYou Entered Wrong Please Try Again...\n");
				System.out.println("   _______________________________________________");

				break;
					
			}

			
		}while(Choice1!=3);	
	}

	 public static boolean login(File file, Scanner read) throws FileNotFoundException {

	        System.out.println("\t Enter Your Username...Please:");
	        String username = read.nextLine();

	        System.out.println("\t Enter Your Password...Please:");
	        String password = read.next();

	        if(password.equalsIgnoreCase("admin")) {
	        	
    	    	try {
					Admin.Admin();
				} catch (IOException e) {
					e.printStackTrace();
				}
    	    } 
	        
	        Scanner scanner = new Scanner(file);

	        while (scanner.hasNextLine()) {

	            String line = scanner.nextLine();

	            String[] parts = line.split("Username: " + ", " + "Password: ");

	            if (parts[0].equals(username) && parts[1].equals(password)) {

					System.out.println("   _______________________________________________");
	                System.out.println("\tYou Have Logged In Successfully...!");
	    	    	System.out.println("   _______________________________________________\n");
	    	    	
	                scanner.close();
	                int Choice2;

	    			do {
	    				System.out.println("\tChoose The Service That You Want:");
	    				System.out.println("\t1- Booking A New Delivery...");
	    				System.out.println("\t2- Track A Delivery...");
	    				System.out.println("\t3- Exit...");

	    				Choice2 = read.nextInt();
	    				
	    				switch(Choice2) {
	    				
	    				case 1:
	    					
	    					try {
								Booking.Booking(file, read);
							} catch (IOException e) {

								e.printStackTrace();
							}
	    					
	    					break;
	    					
	    				case 2:
	    					
	    					String filePath = "/Users/ging3r/eclipse-workspace/Delivery_System/Tracking.txt";

	    				      // Define the target line to search for
	    					  System.out.print("\tPlease Enter The Package ID To Search: ");
	    				      String keyword = read.next();
	    				      System.out.println("   _______________________________________________");

	    				      // Define the regular expression pattern
	    				      Pattern pattern = Pattern.compile("\\b(" + keyword + ")\\b");

	    				      try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    				         String line1;
	    				         while ((line1 = reader.readLine()) != null) {
	    				            // Search for matches in the text data
	    				            Matcher matcher = pattern.matcher(line1);
	    				            if (matcher.find()) {
	    				               // Print the line(s) that contain(s) the keyword
	    				               System.out.println("\t" + line1);
	    				               System.out.println("   _______________________________________________");

	    				            } 
	    				         }
	    				        
		    				         
		    				        //System.out.println("Sorry, the package information with ID " + keyword + " was not found.");
		  	    					//System.out.println("   _______________________________________________");
	    				            

	    				      } catch (IOException e) {
	    				         e.printStackTrace();
	    				      }				
	    					break;
	    					
	    				case 3:
	    					
	    					System.out.println("   _______________________________________________");
	    					
	    					break;
	    				
	    				default:
	    					
	    					System.out.println("\tYou Entered Wrong Please Try Again...\n");
	    					System.out.println("   _______________________________________________");
	    					
	    					break;
	    				}
	    				
	    				
	    			}while(Choice2!=3);
	    			
	                return true;
	            }
	            	
	            
	        } 
	        
	        System.out.println("   _______________________________________________\n");
	        System.out.println("   Invalid Username Or Password...Please Try Again!");
	    	System.out.println("   _______________________________________________\n");  
	    	
	    	
	    	
	        scanner.close();
	        return false;
	   }
	  
	 
	 public static void register(File file, Scanner read) throws IOException {

	        System.out.println("\t Enter Your Username...Please:");
	        String username = read.next();

	        System.out.println("\t Enter Your Password...Please:");	        
	        String password = read.next();

	        System.out.println("\t Enter Your First Name...Please:");
	        String f_name = read.next();
	        
	        System.out.println("\t Enter Your Last Name...Please:");
	        String l_name = read.next();
	        
	        System.out.println("\t Enter Your Email...Please:");
	        String email = read.next();
	        
	        PrintWriter writer = new PrintWriter(new FileWriter(file, true));

	        writer.append("Username: " + username + ", " + "Password: " + password + "\n" 
	        				+ "First Name: " + f_name + ", Last Name: " + l_name + ", Email: " + email + "\n");
			writer.append("   ___________________________________________________________________________\n");
	        writer.close();
	        
			System.out.println("   _______________________________________________");
            System.out.println("\tYou Have Registered Successfully...!");
			System.out.println("   _______________________________________________");

	 }
	 
	 
}
