public class Program {

	public static void main(String[] args) {
		Date obj=new Date();
		

		System.out.println("Enter Day : ");
		int day=ConsoleInput.getInt();
		
		System.out.println("Enter Month : ");
		int month=ConsoleInput.getInt();
		
		System.out.println("Enter Year : ");
		int year=ConsoleInput.getInt();
		
		obj.setDate(day,month,year);
		do {
			System.out.println("==================================================");
			System.out.println("1.ADD DAYS");
			System.out.println("2.ADD MONTH");
			System.out.println("3.ADD YEAR");
			System.out.println("4.DISPLAY DATE");
			System.out.println("5.COMPARE DATES");
			System.out.println("0.EXIT");
			System.out.println("==================================================\n");
			
			System.out.println("Enter Your choice : ");
			int ch=ConsoleInput.getInt();
			
			switch(ch) {
			case 0:
				System.out.println("Existing...");
				return;
			case 1:
				System.out.println("How many days are to be added ? : ");
				int daysToAdd=ConsoleInput.getInt();
				obj.addDays(daysToAdd);
				break;
			case 2:
				System.out.println("How many months are to be added ? : ");
				int monthsToAdd=ConsoleInput.getInt();
				obj.addMonths(monthsToAdd);
				break;
			case 3:
				System.out.println("How many years are to be added ? : ");
				int yearToAdd=ConsoleInput.getInt();
				obj.addYears(yearToAdd);
				break;
			case 4:
				obj.displayDate();
				break;
			default:
				System.err.println("Enter Valid Choice!!");
			}
		}while(true);
	}
}
