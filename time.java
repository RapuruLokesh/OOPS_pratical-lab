package LOKESH;
import java.util.*;

public class time {
    public static void main(String args[]) {
        Date d = new Date();

        System.out.println("Current date is: " + d);

        int month = d . getMonth();
        int year = d . getYear();  
        int minutes = d. getMinutes();
        int hours = d. getHours();   

        System.out.println("Month (0-11): " + month);
        System.out.println("Year :" +year);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
    }
}