import java.util.Scanner;

public class Judge {
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Please enter a radius:");
	  double radius = input.nextDouble() ;
	  final double PI = 3.1415926;
	  if (radius >= 0){
		  double area = radius * radius * PI;
		  System.out.println(" The area for the circle of radius " + 
		  radius + " is " + area );
	  }
	  else{
		  System.out.println("Negative ipput");
	  }
  }
}
