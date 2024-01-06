/** 
 * Prints the calendar of the user given year.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	/** 
	 * Prints the calendar of the user given year.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0;
        int yearUsergiven = Integer.parseInt(args[0]); 
		// advances the date as long as the year is smaller than the user given year
		// no need to print
	 	while (year < yearUsergiven) {
            advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
		// sets year as the user given year, in order of the fucntion 'advance' to work properly without changing the varibales name in it
        year = yearUsergiven;
		// advances the date until the year finishes
        while (year < yearUsergiven + 1) {
			// if it's first day of the week print sunday after the date
			if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			}
			// if it's not first day of the week print just the date
			else
			System.out.println(dayOfMonth + "/" + month + "/" + year);	
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// if it's the last day of the month : check the cases inside
		if (dayOfMonth == nDaysInMonth(month, year)) {
			// if it's the last month of the year: advance year, bring month to january and set day of the month back to 1
			if (month == 12) {
				year++;
				month = 1;
				dayOfMonth = 1;
			}
			// if it's not the last month of the year: advance month and set day of the month back to 1
			else {
				month++;
				dayOfMonth = 1;
			}
		}
		// if it's not last day of the month: advance day of month
		else
		dayOfMonth++;

		// if it's the last day of the week: set day of the week back to 1
		if (dayOfWeek == 7) {
			dayOfWeek = 1;
		}
		// if it's not the last day of the week: advance day of the week
		else
		dayOfWeek++;
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    // leap year is divisible by 400 || divisible by 4 and not by 100
	    if (year % 400 == 0) {
			return true;
		} else if (((year % 4) == 0) && ((year % 100) != 0) ) {
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			// feb has 29 days in leap year, 28 in common year
			case 2: 
			if (isLeapYear(year)) {
				return 29;
			}
			else
			return 28;
			case 4: return 30;
			case 6: return 30;
			case 9: return 30;
			case 11: return 30;
			// all other months (default) have 31 days
			default: return 31;
		}
	}
}
