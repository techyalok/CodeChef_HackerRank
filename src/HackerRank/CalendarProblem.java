package HackerRank;
import java.util.Calendar;

public class CalendarProblem {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
	    /* Calendar's getInstance method returns a Calendar object whose calendar fields
	    have been initialized with the current date and time */
        System.out.println("Today: "+ calendar.getTime());
        //Returns a Date object representing this Calendar's time value
        calendar.set(2017,7,16);  //yyyy,mm,dd.  //Set the Calendar pointer
        //calendar.set(calendar.MONTH, 8);
        //calendar.set(calendar.DATE, 14);
        System.out.println("Back to 16/07/2017: "+ calendar.getTime());
        int day = calendar.get(calendar.DAY_OF_WEEK);
        switch(day){
            case 1: System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thursday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
        }

    }
}
