import java.io.*;
import java.util.*;

public class Booking {

	public static void Booking(File file, Scanner input1) throws IOException{
	Scanner read = new Scanner(System.in);
    File file1 = new File("Bookinginfo.txt");
    PrintWriter output = new PrintWriter(new FileWriter(file1, true));
    Scanner input = new Scanner(file1);
    
    if (!file1.exists()) {
		
		file1.createNewFile();
	}
    
    
    
    System.out.println("   _______________________________________________");	
    System.out.println("\tPlease Do Enter:\n" + 
    "\t-The Commercial Registration No. ...(IF Company)\n" +		
    "\t-The ID No. ...(IF Individual)\n");
    String id = read.nextLine();
    
    
    if (id.charAt(0) == '0') {
       
    	Company c = new Company();
        c.setCRN(id);
        output.println("___________________________________________________________________________\n");
        output.println("Order Information:\n");
        output.println("The Commercial Registration No: "+c.getCRN());
        
        
    } else if (id.charAt(0) == '1') {

        Individual i = new Individual();
        i.setIndividual_id(id);
        output.println("___________________________________________________________________________\n");
        output.println("Order Information:\n");
        output.println("The ID No:"+i.getIndividual_id());
        
    }
    else{
            System.out.println("Invalid Number...This Number Is Not Registed In The System,Please Try Again...");
			System.out.println("   _______________________________________________");
           
    }
    
   User u =new User ();

   System.out.println("\tPlease Do Enter The Month...: ");
   String date = read.nextLine();
   u.setAppointment_date(date);
   
   System.out.println("   _______________________________________________");
   System.out.println("\tPlease Do Enter The Day...: ");
   String day = read.nextLine();
   u.setAppointment_day(day);

   System.out.println("   _______________________________________________");
   System.out.println("\tPlease Pick A Schedule For Your Shipment...:\n\n"
           + "\t1]From 00:00 A.M to 06:00 A.M\n"
           + "\t2]From 06:00 A.M to 12:00 P.M\n"
           + "\t3]From 12:00 P.M to 18:00 P.M\n"
           + "\t4]From 18:00 P.M to 00:00 A.M\n");

   int Choice3 = read.nextInt();
   switch (Choice3) {

       case 1:
           u.setAppointment_time("From 00:00 A.M to 06:00 A.M");
           break;
       case 2:
           u.setAppointment_time("From 06:00 A.M to 12:00 P.M");
           break;
       case 3:
           u.setAppointment_time("From 12:00 P.M to 18:00");
           break;
       case 4:
           u.setAppointment_time("From 18:00 P.M to 00:00 A.M");
           break;

       default:
			
			System.out.println("\tYou Entered Wrong Please Try Again...");
			System.out.println("   _______________________________________________");
			
			break;
   }
   
   			 System.out.println("   _______________________________________________");	
			 System.out.println("To Ensure Having High Delivery Quality, Please Do Answer These Questions...:");
             
   			
             System.out.println("   _______________________________________________");	
             System.out.println("\tDose The Shipment Require Air Conditioning...?");
             String choice = read.next();

             
   			 System.out.println("   _______________________________________________");	
             System.out.println("\tHow Many Hours Do You Need The Vehicle...? ");
             String h = read.next();

             Transport_Feature_Info T = new Transport_Feature_Info(null, null,null, h, choice);
             
   			 System.out.println("   _______________________________________________");	
             System.out.println("\tChoose The Type Of Vehicle...?\n\n"
                     + "\t 1] Vehicle A...: )\n"
                     + "\t    ID: 223344\n"
                     + "\t    Capacity: Between 500 kg & 2.5 Tons...\n"
                     + "\t 2] Vehicle B...: )\n"
                     + "\t    ID: 990044\n"
                     + "\t    Capacity: Between 4.5 & 5.5 Tons...\n"
                     + "\t 3] Vehicle C...: )\n"
                     + "\t    ID: 445566\n"
                     + "\t    Capacity: Between 7.5 & 9 Tons...\n");
             
             int Choice4 = read.nextInt();
             
             switch(Choice4){
                 case 1:
                      T.setVehicle_Name("Vehicle A.");
                      T.setcapacity("Capacity: Between 500 kg & 2.5 Tons.");
                      T.setVehicle_ID("223344");
                   break;
                    case 2:
                      T.setVehicle_Name("Vehicle B.");
                      T.setcapacity("Capacity: Between 4.5 & 5.5 Tons.");
                      T.setVehicle_ID("990044");
                   break;
                    case 3:
                      T.setVehicle_Name("Vehicle C.");
                      T.setcapacity("Capacity: Between 7.5 & 9 Tons.");
                      T.setVehicle_ID("445566");
                   break;
                    default:
    					
    					System.out.println("\tYou Entered Wrong Please Try Again...\n");
    					System.out.println("   _______________________________________________");
    					
    					break;
             }
             
             Address a=new Address();

   			 System.out.println("   _______________________________________________");	
             System.out.println("\tPlease Enter The Pick Up Address: ");
             System.out.println("\n\tState: ");
             String s = read.next();
             a.setState(s);
             
             System.out.println("\tCity:");
             String c = read.next();
             a.setCity(c);
             
             System.out.println("\tStreet: ");
             String st = read.next();
             a.setStreet(st);
             
             System.out.println("\tZip Code: ");
             String z = read.next();
             a.setZip(z);
             
             
             Address a1=new Address();

             System.out.println("   _______________________________________________");	
             System.out.println("\t Please Enter The Drop Off Address:");
             System.out.println("\n\tState: ");
             String s1 = read.next();
             a1.setState(s1);
             
             System.out.println("\tCity: ");
             String c1 = read.next();
             a1.setCity(c1);
             
             System.out.println("\tStreet: ");
             String st1 = read.next();
             a1.setStreet(st1);
             
             System.out.println("\tZip Code: ");
             String z1 = read.next();
             a1.setZip(z1);
   
             Random rand = new Random();
             
             String total = "1234567890";
             String random = "";
             
             int length = rand.nextInt(5);
             
             char[] t= new char[length];
             
             for(int i=0; i<length;i++) {
            	 t[i]=total.charAt(rand.nextInt(total.length()));
             }
             for(int i=0; i<t.length;i++) {
            	 random += t[i];
             }
             Total to = new Total();
             System.out.println("   _______________________________________________");
             System.out.println("\tYour Total Is...:\n" + random);
             to.setTotal(random);
             output.println("Total: " + to.getTotal());
             
             System.out.println("   _______________________________________________");
             System.out.println("\tPlease Choose The Payment Method...:");
             System.out.println("\t  1]Credit Card...");
             System.out.println("\t  2]Cash On Delivery...");
             int Choice = read.nextInt();

             switch(Choice) {
             
             case 1:
             	
             	u.setPayment("Credit Card");
 				System.out.println("   _______________________________________________");
             	System.out.println("\tCridet Card Method Was Choosen...\n");
             	System.out.println("\tPlease Enter The CVV Number...:\n");
             	String cvv = read.next();
                output.println("CVV: " + cvv);

             	System.out.println("\tYour Order Have Been Confirmed...\n");

 				break;
             	
             case 2:
             	
              	u.setPayment("Cash On Delivery");
 				System.out.println("   _______________________________________________");
             	System.out.println("\tCash On Delivery Method Was Choosen...\n");
             	System.out.println("\tYour Order Have Been Confirmed...\n");

 				break;
             	
             default:
 				System.out.println("   _______________________________________________");
             	System.out.println("\tYou Entered Wrong Please Try Again...\n");

 				break;
             }
             String ID = "1234567890";
             String Random = "";
             String stat = "In Progress";
             
             int length1 = rand.nextInt(4);
             
             char[] text= new char[length1];
             
             for(int i=0; i<length1;i++) {
            	 text[i]=ID.charAt(rand.nextInt(ID.length()));
             }
             for(int i=0; i<text.length;i++) {
            	 Random += text[i];
             }
             Package p = new Package();
             System.out.println("   _______________________________________________");
             System.out.println("\tThe Package ID Is...:\n" + Random);
             System.out.println("   _______________________________________________");
             p.setid(Random);
             p.setStatus(stat);
             output.println("Package ID: " + p.getId() + ", " + "Status: " + p.getStatus());
             
             
             output.println(u.toString());
             output.println(T.toString());
             output.println(a.toString());
             output.println(a1.toString());
             
             input.close();
             output.close();
			
	}


  }


