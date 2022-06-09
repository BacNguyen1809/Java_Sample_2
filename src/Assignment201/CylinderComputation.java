/*
	* @author bacng
	* @ Date Jun 8, 2022
*/
package Assignment201;


import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input radius of cylinder: ");
		double radius = Double.parseDouble(scanner.nextLine());
		System.out.println("Input heigth of cylinder: ");
		double height = Double.parseDouble(scanner.nextLine());
		double sufaceArea = 2*Math.PI+radius*(radius+height);
		double baseArea =	Math.PI*radius*radius;
		double volume= Math.PI*radius*2*height;
		System.out.println("Surface Area is "+sufaceArea);
		System.out.println("Base Area is "+baseArea);
		System.out.println("Volume is "+volume);
		
	}

}
