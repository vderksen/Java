// JAC444NEE
// Valentina Derksen
// Student id: 153803184

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System. in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input. nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		if (month == 1 || month ==2) {
			month += 12;
			year -= 1;
		}
		System.out.print("Enter the day of the months: 1-31: ");
		int day = input.nextInt();
		int century = year * 100;
		int yearOfCentury = year % 100;
		int dayOfWeek = (day + (26 * (month + 1))/10 + yearOfCentury + yearOfCentury/4 + century/4 + 5*century)%7;
		switch (dayOfWeek) {
		case 0: System.out.println("Day of the week is Saturday");
		break;
		case 1: System.out.println("Day of the week is Sunday");
		break;
		case 2:	System.out.println("Day of the week is Monday");
		break;
		case 3:	System.out.println("Day of the week is Tuesday");
		break;
		case 4:	System.out.println("Day of the week is Wednesday");
		break;
		case 5: System.out.println("Day of the week is Thursday");
		break;
		case 6: System.out.println("Day of the week is Friday");
		break;
		}
	}

}
