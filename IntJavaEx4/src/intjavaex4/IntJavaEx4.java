/**
 * @Author: Alex Mitchelmore
 * @Exercise: Exercise 4
 * @Date: 2019-09-19
 */
package intjavaex4;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class IntJavaEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for first name and last name
        p("Please provide first name");
        String firstName = sc.nextLine();
        p("Please provide last name");
        String lastName = sc.nextLine();
        
        //Prompt for birth year
        p("Please provide birth year");
        int year = sc.nextInt();
        sc.nextLine();
        
        //Prompt for birth month
        p("Please provide birth month");
        int month = sc.nextInt();
        sc.nextLine();
        
        //Prompt for birth day
        p("Please provide birth day");
        int day = sc.nextInt();
        sc.nextLine();
        
        //Create locaDate object based on user inputs
        LocalDate birthDay = LocalDate.of(year, month, day);
        
        p("Hello " + firstName + " " + lastName + "\n");
        
        //Display birthday
        p("Birthday: " + birthDay + "\n");
        
        p("Birth year: " + birthDay.getYear());
        p("Day of year: " + birthDay.getDayOfYear());
        p("Day of week: " + birthDay.getDayOfWeek());
        p("month: " + birthDay.getMonth());
        
    }
    
    
    static void p(String msg){
        System.out.println(msg);
    }
}
