package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String YEARPROMPT = "YEAR> ";
	private final static String MONTHPROMPT = "MONTH> ";
	private final static String DAYPROMPT = "DAY> ";

	public static int parseDay(String day) {
		if(day.equals("SU") )
			return 0;
		if(day.equals("MO") )
			return 1;
		if(day.equals("TU") )
			return 2;
		if(day.equals("WE") )
			return 3;
		if(day.equals("TH") )
			return 4;
		if(day.equals("FR") )
			return 5;
		if(day.equals("SA") )
			return 6;
		else 
			return 0;
	}
	public void printPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int year=1;
		int month=1;
		int day = 1;

		while (true) {
			System.out.println("년도를 입력하시오:");
			System.out.print(YEARPROMPT);
			year = scanner.nextInt();
			if(year == -1) {
				System.out.println("해를 잘못 입력 하셨습니다.");
				break;
			}
			System.out.println("달을 입력하시오:");
			System.out.print(MONTHPROMPT);
			month = scanner.nextInt();
			if(month<0||month>13) {
				System.out.println("달을 잘못 입력 하셨습니다.");
				break;
			}
			System.out.println("첫번째 날을 입력하시오:");
			System.out.print(DAYPROMPT);
			String week = scanner.next();
			
			
			cal.printCalendar(year, month,parseDay(week));
		}
		System.out.print("FINISH");
		scanner.close();
	}
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.printPrompt();
	}

}
