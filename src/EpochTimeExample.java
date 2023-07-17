
public class EpochTimeExample {

	public static void main(String[] args) {
		long epoch = System.currentTimeMillis()/1000 + 9*60*60;
		
		
		int year = 1970;
		for (;;) {
			boolean isLeap = (year%4==0 &&year%100!=0) || (year%400==0);
			int daysOfYear = isLeap ? 366 : 365;
			if (epoch - daysOfYear*24*60*60 >= 0) {
				epoch = epoch - daysOfYear*24*60*60;
				year++;
			} else
				break;
		}
		int month = 0;
		
		System.out.println(year);
		System.out.println(epoch);
		
		/*
		 * int month = 0;
		 * for (int i=1; i<12; i++) {
		 * int daysOfMonth = 0;
		 * 
		 * switch(i) {
		 * case 1:
		 * case 3:
		 * case 4:
		 * case 7:
		 * case 8:
		 * case 10:
		 * case 12:
		 * 		daysOfMonth = 31;
		 * 		break;
		 * case 2:
		 * 		boolean isLeap = (year%4==0 && year%100!=0) || (year%400
		 * 		daysOfMonth = isLeap ? 29:28;
		 * 		braek;
		 * default:
		 * 		daysOfMonth = 30;
		 * 		break;
		 * }
		 * 
		 * if(epoch - datsOfMonth*24*60*60 >= 0) {
		 * epoch = epoch - daysOfMonth*24*60*60;
		 * continue;
		 * }
		 * 
		 */

	}

}
