package calendar;

public class Calendar {

	private final static int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private final static int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};

	public static boolean LeapMaxDays(int year) {
		if(year%4==0&&(year%100!=0||year%400==0))
			return true;
		else
			return false;
	}

	public static int MaxDaysOfMonth(int year,int month) {
		if(LeapMaxDays(year)) {
			return LEAP_MAX_DAYS[month-1];
		}
		else 
			return MAX_DAYS[month - 1];
	}

	
	public void printCalendar(int year,int month,int day) {
		
		System.out.println("   <<"+year+"년"+month+"월>>");
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("=====================");
		
		for(int i =0;i<day;i++) {
			System.out.print("   ");
		}
		for(int i = 1;i<=MaxDaysOfMonth(year,month);i++) {
			System.out.printf("%3d",i);
			if((i+day) % 7 == 0) {
				System.out.println();
			}		
		}
		System.out.println();
	}
}
