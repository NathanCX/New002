import java.util.Scanner;

public class SubtractionQuizSimple {
   public static void main (String[] args){
	//1.Generate two random single-digit integers
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);
	
	//2.if num1 < num2 , swap num1 with num2
	if (number1 < number2){
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
	
	//3.Prompt the student to answer "What is number1 - number2?"
	System.out.println("What is " + number1 + " - " + number2 +
			 "? ");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();
	
	//4.Grade the answer and display the result
	if (number1 - number2 == answer){
		System.out.println("You are correct!");
	}
	else{
		System.out.println("Your answer is wrong\n" + number1 +
		" - " + number2 + " should be " + (number1 - number2));
	}
		
   }
}
