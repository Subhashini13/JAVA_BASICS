package day_1;

import java.util.Scanner;

/*
 * Implement a program to calculate the Simple Interest by using the formula given below and display the calculated Simple Interest.

Simple Interest = (principal*rate of interest*time)/100 

 
 */
public class DataTypeOperators_Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal");
		int principal = sc.nextInt();
		System.out.println("Enter the rate");
		int rate = sc.nextInt();
		System.out.println("Enter the time in years:");
		int time = sc.nextInt();
		
		System.out.println("Simple Interest = " + (principal * rate * time)/100 );
		
	}

}
