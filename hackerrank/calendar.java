package hackerrank;
import java.time.LocalDate;

public class calendar {
	 public static String findDay(int month, int day, int year) {
	        LocalDate dt =  LocalDate.of(year, month, day);
	        return dt.getDayOfWeek().toString();
	  }
	 
	 public static void main(String[] args) {
			System.out.print(findDay(11, 26, 2024));
		}
	
}
