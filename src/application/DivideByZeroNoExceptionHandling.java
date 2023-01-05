package application;
//Divisão de inteiro sem tratamento de exceção.
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

	// demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
	public static int quotient(int numerator, int denominator) {
		return numerator / denominator; // possível divisão por zero
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an integer numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();
		
		int result = quotient(numerator, denominator);
		System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
		
		scanner.close();
	}

}
