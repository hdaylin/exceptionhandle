
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {

		try{

			int a, b, result;

			Scanner input = new Scanner(System.in);
			System.out.println("Input two integers");

			a = input.nextInt();
			b = input.nextInt();

			result = a / b;

			System.out.println("Result = " + result);

		}catch (ArithmeticException e){
			System.out.println("You cannot divide by zero. ");

		}finally {
		    System.out.println("finally block will execute.");
		}

	} 
}
