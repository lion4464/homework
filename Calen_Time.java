import java.util.*;
public class Calen_Time{
	
			/** Main method */
			public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			// Prompt the user to enter year
				System.out.print("Enter full year (e.g., 2012): ");
					int year = input.nextInt();

			// Prompt the user to enter month
				System.out.print("Enter month as a number between 1 and 12: ");
					int month = input.nextInt();

			// Print calendar for the month of the year
					printMonth(year, month);
		
		long totalMillisecond=System.currentTimeMillis();
		long second=totalMillisecond/1000;
		long currentSecond=second%60;
		long totalMinutes=second/60;
		long currentMinute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentHour=(totalHours%24)+5;
	
	System.out.println("\n Hozir:"+currentHour+":"+currentMinute+":"+currentSecond+" GTM");


			}
		
			/** A stub for printMonth may look like this */
			public static void printMonth(int year, int month) {
				System.out.println(month + " " + year);
				printMonthTitle(year,month);
			}

			/** A stub for printMonthTitle may look like this */
			public static void printMonthTitle(int year, int month) {
				System.out.println("       $$$ " + getMonthName(month)+ " " + year+" $$$ ");
				System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
				System.out.println("  Yak Du Se Chor Pay Ju Sha");
				printMonthBody(year,month);
			}
				// Get month name
			public static String getMonthName(int month) {
				String nameOfmonth="";
				switch (month) 
				{
				case 1: nameOfmonth="Yanvar"; break;	
				case 2: nameOfmonth="Fevral"; break;	
				case 3: nameOfmonth="Mart"; break;	
				case 4: nameOfmonth="Aprel"; break;	
				case 5: nameOfmonth="May"; break;	
				case 6: nameOfmonth="Iyun"; break;	
				case 7: nameOfmonth="Iyul"; break;	
				case 8: nameOfmonth="Avgust"; break;	
				case 9: nameOfmonth="Sentyabr"; break;	
				case 10: nameOfmonth="Oktyabr"; break;	
				case 11: nameOfmonth="Noyabr"; break;	
				case 12: nameOfmonth="Dekabr"; break;	
				}
				return nameOfmonth;
			}

			/** A stub for printMonthBody may look like this */
			public static void printMonthBody(int year, int month) {
				int startDay = getStartDay(year, month);

				int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
				int i = 0;
				for (int j = 0; j< startDay; j++){
  						System.out.print("    ");
					}

  				for (i = 1; i <= numberOfDaysInMonth; i++) {
  					System.out.printf("%4d", i);
  					if ((i + startDay) % 7 == 0)
						System.out.println();
					}
					System.out.println();
			}
			public static int getStartDay(int year, int month) {
				final int START_DAY_FOR_JAN_1_1800 = 2;

				int totalNumberOfDays = getTotalNumberOfDays(year, month);

				return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
			}
			 /** Get the total number of days since January 1, 1800 */
 public static int getTotalNumberOfDays(int year, int month) {
 int total = 0;

 // Get the total days from 1800 to 1/1/year
 for (int i = 1800; i < year; i++)
 	if (isLeapYear(i))
 		total = total + 366;
 	else
 		total = total + 365;

 // Add days from Jan to the month prior to the calendar month
 	for (int i = 1; i < month; i++)
		total = total + getNumberOfDaysInMonth(year, i);

 return total;
 }		

public static int getNumberOfDaysInMonth(int year, int month) {
	 	if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12)
 		return 31;

 		if (month == 4 || month == 6 || month == 9 || month == 11)
 			return 30;

 		if (month == 2) return isLeapYear(year) ? 28 : 29;
		
		return 0;
	}
	public static boolean isLeapYear(int year) {
		

 		return (year % 4 == 0) && (year % 100 != 0||year % 400 == 0);
	}
}