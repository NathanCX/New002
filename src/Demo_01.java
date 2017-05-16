import java.util.Scanner;

public class Demo_01 {
  public static void main(String[] args){
	  int number1 = (int)(Math.random()*10);
	  int number2 = (int)(Math.random()*10);
	  
	  if (number1 > number2){
	      int answer = number1 - number2;
	      System.out.println("Please calc the answer: " +
		  number1 + " - " + number2 + " = " );
	      
	      Scanner input = new Scanner(System.in);
		  int answer2 = input.nextInt();
		  if (answer2 == answer){
			  System.out.println("you are true");
		  }
		  else{
			  System.out.println("you are wrong");
		  }
	  }
	  else 
	  {
		  int answer = number2 - number1;
		  System.out.println("Please calc the answer: " +
		  number2 + " - " + number1 + " = " );
		  
		  Scanner input = new Scanner(System.in);
		  int answer2 = input.nextInt();
		  if (answer2 == answer){
			  System.out.println("you are correct");
		  }
		  else{
			  System.out.println("you are wrong");
		  }
	  }
	  
	 
	  
  }
}
