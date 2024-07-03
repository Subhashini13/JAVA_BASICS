package day_2;

import java.util.Scanner;
/*
Implement a program to convert temperature from f to c degree by using the formula given below and display the converted value. 

C = ((F-32)/9)*5 where, C represents temperature in c and F represents temperature in f.

 */
public class Ex05_FtoC_conversion {
	
	public static int calculateFtoC(int f) {
		return (((f-32)/9)*5);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in F");

		int Ft = sc.nextInt();
		
		int Ce = calculateFtoC( Ft);
		System.out.println("Celcius : "+ Ce);
		
	}

}
