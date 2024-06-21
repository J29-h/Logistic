import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Admin extends User{


	public static void Admin() throws IOException {
		
		Scanner read = new Scanner (System.in);
	
		int Choice2;

		do {
			System.out.println("\tChoose The Service That You Want:");
			System.out.println("\t1- View Customer Information...");
			System.out.println("\t2- View The Delivery Orders...");
			System.out.println("\t3- View The Tracking Delivery For Orders...");
			System.out.println("\t4- Update Delivery Track Information...");
			System.out.println("\t5- Exit...");

			Choice2 = read.nextInt();
			
			switch(Choice2) {
			
			case 1:
				
				String filePath = "/Users/ging3r/eclipse-workspace/Delivery_System/Usres.txt";

			      try {
			         // Create a FileInputStream object to read the file
			         FileInputStream fileInputStream = new FileInputStream(new File(filePath));

			         // Create a Scanner object to read the contents of the file
			         Scanner scanner = new Scanner(fileInputStream);

			         // Read and display each line of the file
			         while (scanner.hasNextLine()) {
			            String line = scanner.nextLine();
			            System.out.println(line);
			         }

			         // Close the file and the scanner
			         scanner.close();
			         fileInputStream.close();

			      } catch (FileNotFoundException e) {
			         System.out.println("\t File not found..." + e.getMessage() + "\n");
			      } catch (Exception e) {
			         System.out.println("\t Error reading file..." + e.getMessage() + "\n");
			      }
			
				
				break;
				
			case 2:
				
				String filePath1 = "/Users/ging3r/eclipse-workspace/Delivery_System/Bookinginfo.txt";

			      try {
			         // Create a FileInputStream object to read the file
			         FileInputStream fileInputStream = new FileInputStream(new File(filePath1));

			         // Create a Scanner object to read the contents of the file
			         Scanner scanner = new Scanner(fileInputStream);

			         // Read and display each line of the file
			         while (scanner.hasNextLine()) {
			            String line = scanner.nextLine();
			            System.out.println(line);
			         }

			         // Close the file and the scanner
			         scanner.close();
			         fileInputStream.close();

			      } catch (FileNotFoundException e) {
			         System.out.println("\t  File not found..." + e.getMessage() + "\n");
			      } catch (Exception e) {
			         System.out.println("\t  Error reading file..." + e.getMessage() + "\n");
			      }
				
				break;
				
			case 3:
				
				String filePath2 = "/Users/ging3r/eclipse-workspace/Delivery_System/Tracking.txt";

			      try {
			         // Create a FileInputStream object to read the file
			         FileInputStream fileInputStream = new FileInputStream(new File(filePath2));

			         // Create a Scanner object to read the contents of the file
			         Scanner scanner = new Scanner(fileInputStream);

			         // Read and display each line of the file
			         while (scanner.hasNextLine()) {
			            String line = scanner.nextLine();
			            System.out.println(line);
			         }

			         // Close the file and the scanner
			         scanner.close();
			         fileInputStream.close();

			      } catch (FileNotFoundException e) {
			         System.out.println("\t  File not found..." + e.getMessage() + "\n");
			      } catch (Exception e) {
			         System.out.println("\t  Error reading file..." + e.getMessage() + "\n");
			      }
				
				break;
			
			case 4:
				
				String inputFilePath1 = "/Users/ging3r/eclipse-workspace/Delivery_System/Bookinginfo.txt";
		        String outputFilePath2 = "/Users/ging3r/eclipse-workspace/Delivery_System/Tracking.txt";
		        String keyword = null;
		        String wordToModify = "In Progress";
		        String newWord = null;
		        
		        System.out.println("\tPlease Enter The Package ID...:\n");
	            keyword =read.next();
	            
		        System.out.println("   _______________________________________________");
	            System.out.println("\tPlease Choose The Status Of The Delivery...:\n");
	            System.out.println("\t  1]Out For Delivery...");
	            System.out.println("\t  2]Shipped...");
	            System.out.println("\t  3]Canceled...");
	            System.out.println("\t  4]Returned...");

	            Package p = new Package();
	            int Choice = read.nextInt();

	            switch(Choice) {
	            
	            case 1:
	            	
	            	newWord=("Out For Delivery");
	            	System.out.println("\tOut For Delivery Was Choosen...\n");
					System.out.println("   _______________________________________________");
					
	            	break;
	            	
	            case 2:
	            	
	            	newWord=("Shipped");
	            	System.out.println("\tShipped Was Choosen...\n");
					System.out.println("   _______________________________________________");
					
	            	break;
	            	
	            case 3:
	            	
	            	newWord=("Canceled");
	            	System.out.println("\tCanceled Was Choosen...\n");
					System.out.println("   _______________________________________________");
					
	            	break;
	            	
	            case 4:
	            	
	            	newWord=("Returned");
	            	System.out.println("\tReturned Was Choosen...\n");
					System.out.println("   _______________________________________________");
					
		            
	            	break;
	            default:
					System.out.println("   _______________________________________________");
	            	System.out.println("\tYou Entered Wrong Please Try Again...\n");

					break;
	            }


		        // Read input from the input file and modify it
	            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath1));
	                    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath2))) {
	                  String line;
	                  while ((line = reader.readLine()) != null) {
	                     // Modify the word in the line
	                     String modifiedLine = line.replaceAll(wordToModify, newWord);
	                     // Write the updated text back to the file
	                     writer.write(modifiedLine + "\n");
	 					p.setStatus(newWord);

	                  }
	               } catch (IOException e) {
	                  e.printStackTrace();
	               }
					
			      break;
				
			case 5:
				
				
				break;
				
			default:
				
				System.out.println("   _______________________________________________");
				System.out.println("\tYou Entered Wrong Please Try Again...\n");
				System.out.println("   _______________________________________________");
				
				break;
			}
			
			
		}while(Choice2!=5);
	}
	

	
	}

