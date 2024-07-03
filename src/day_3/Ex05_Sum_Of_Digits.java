package day_3;

import java.util.Scanner;

public class Ex05_Sum_Of_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int inputNumber = sc.nextInt();
		int sumOfDigits = 0;
		int temp = 0;

		while (inputNumber > 0) {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		}

		System.out.println("Sum of digits are : " + sumOfDigits);
	}

}
