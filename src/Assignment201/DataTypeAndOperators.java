/*
	* @author bacng
	* @ Date Jun 8, 2022
*/
package Assignment201;

import java.util.Scanner;

public class DataTypeAndOperators {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Input fist number: ");
		int fistNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("Input second number: ");
		int secondNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("Input third number: ");
		int thirdNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("Input fourth number: ");
		int fourthNumber = Integer.parseInt(scanner.nextLine());
		if((fistNumber==secondNumber)&&(fistNumber==thirdNumber)&&(fistNumber==fourthNumber))
			System.out.println("Number are equal");
		else System.out.println("Number are not equal");
		
	}
	
}
