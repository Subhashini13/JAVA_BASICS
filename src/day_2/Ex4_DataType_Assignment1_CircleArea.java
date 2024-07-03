package day_2;

import java.util.Scanner;

public class Ex4_DataType_Assignment1_CircleArea {
	static double radius;
	static double areaofCircle(double radius) {
		return Math.PI * radius * radius;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		double radius = sc.nextFloat();
		
		double area = areaofCircle(radius);
		System.out.println("The area of Circle is : " + area);
		
		
		
	}

}
