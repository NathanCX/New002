import java.util.Scanner;

public class ComputeAndInterpretBMI {
  public static void main (String[] args){
	  Scanner input = new Scanner(System.in);
	  
	  //Prompt the user to enter weight in pounds
	  System.out.println("Enter weight in pounds: ");
	  double weight = input.nextDouble();
	  
	  //Prompt the uesr to enter height in inches
	  System.out.println("Enter height in inches: ");
	  double height = input.nextDouble();
	  
	  final double KILOGRAMS_PER_POUND = 0.45359237;
	  final double METERS_PER_INCH = 0.0254;
	  
	  double weightInkKilograms = weight * KILOGRAMS_PER_POUND;
	  double heightInMeters = height * METERS_PER_INCH;
	  double bmi = weightInkKilograms / 
			  (heightInMeters * heightInMeters);
	  
	  //Display result
	  if(bmi < 16)
		  System.out.println("You are serious underweight");
	  else if(bmi < 18)
		  System.out.println("You are underweight");
	  else if(bmi < 24)
		  System.out.println("You are normal weight");
	  else if(bmi < 29)
		  System.out.println("You are overweight");
	  else if(bmi < 35)
		  System.out.println("You are serious overweight");
	  else
		  System.out.println("You are gravely overweight");
	  
  }
}
