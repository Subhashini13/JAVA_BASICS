package day_2;
//		The code given below checks whether a given number is even or odd. Execute the code by assigning different values to number variable.

import java.util.Scanner;

public class Ex07_EvenOdd_If_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check whether its Even or Odd");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println(number + " is even number.");
		}
		else {
			System.out.println(number + " is odd number.");
		}

	}

}
