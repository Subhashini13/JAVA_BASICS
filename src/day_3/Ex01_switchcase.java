package day_3;

public class Ex01_switchcase {
	public static void main(String[] args) {
		int day=6; //representing the day of week 1-Monday...7-Sunday 8 invalid
		
		switch(day){
		
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
		break;
		case 4:
			System.out.println("Thursday");
		break;
		case 5:
		
			System.out.println("Friday");
		break;
		case 6:
		case 7:
			System.out.println("Weekend");
		break;
		
		default:
			System.out.println("Invalid");
		
		}
	}
}
