import java.util.Scanner;
public class GasMileage{
  
  public static void main(String[] argument){
  
  Scanner input = new Scanner(System.in);
  
  	
  	int mileageCounter = 0;
  	double sum = 0.0;
  	
  	System.out.print("Run program? Enter 'yes' to continue: ");
  	String runProgram = input.next();

  		while (runProgram.equalsIgnoreCase("yes") ){
  		
  			System.out.println("Enter miles driven: ");
  			int milesDriven = input.nextInt();
  	
  			System.out.print("\nEnter gallons used: ");
  			int gallonUsed = input.nextInt();
  
  			double gasMileage = (double) milesDriven / gallonUsed;
  		
 		
 			System.out.print("\nMile per gallon of trip is: " + gasMileage);
 		
 			mileageCounter ++;
 			sum += gasMileage;
 			
 			System.out.println();
 			System.out.print("Run program? Enter 'yes' to continue: ");
  			runProgram = input.next();

 		
			

 			
 		}


 System.out.println("\nmiles per gallon of all trips up to this point is: " + sum);
 		
 if (mileageCounter != 0){
 
 double average = (double) sum / mileageCounter;
 System.out.print("Average miles per gallon is: " + average);
 
 }
 else 
 System.out.print("No data was entered");
 		
 		
 		
 		
 		
  
  
  
  
	
  
	
	
  
  
  }

}
