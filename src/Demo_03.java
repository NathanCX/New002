import java.util.Scanner;

public class Demo_03 {
	public static void main(String[] args){
		System.out.println("Pleaes enter a number: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		if (num1 % 5 == 0)
			System.out.println("HiFive");
		
		if (num1 % 2 == 0)
			System.out.println("HiEven");
		else
			System.out.println("HiNothing");
	}
}
