package day_2;
/*
 * Implicit Type Conversion is also known as Widening conversion. It happens in the below scenarios: 

When a value of a data type with smaller range is assigned to a variable of a compatible data type with larger range. 

When two variables of different data types are involved in an expression, the value of smaller range datatype is converted to a value of larger range datatype and then the operation is performed. 
 */
public class Ex1_Implicit_Type_Conversion {
	public static void main(String[] args) {
		int a = 10;
		double valuea  = a;
		System.out.println("After Implicit Conversion : " + valuea);
	}


}
