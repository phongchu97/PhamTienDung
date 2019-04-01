package Session9;
import java.time.*;
public class Session9 {
    public static void getLeapYear() {
        LocalDate startYear = LocalDate.of(1901, 1, 1);
        int year = startYear.getYear();
        while(year % 4 != 0) {
            year += 1;
        }
        while(year <= 2000) {
            System.out.println(year);
            year += 4;
        }
    }
    public static  void  main(String[] args) {
        getLeapYear();
    }
}
