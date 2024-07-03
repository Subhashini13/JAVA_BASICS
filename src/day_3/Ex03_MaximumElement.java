package day_3;

import java.util.Scanner;

public class Ex03_MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number1 : ");
		int num1 = sc.nextInt();
		System.out.println("ENter the number2 : ");
		int num2 = sc.nextInt();
		System.out.println("ENter the number3 : ");
		int num3= sc.nextInt();
		
		int res = (num1 > num2 && num1 > num3) ? num1 : ((num2 > num3) ? num2 : num3);
		
		System.out.println(res + "is maximum element");
	}

}
