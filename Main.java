/******************************************** 
*	AUTHORS:	Noah McDaniel
*	LAST MODIFIED:	12/5/2024
********************************************/

/********************************************
*	STUDY HOURS TRACKER
*********************************************
*	PROGRAM DESCRIPTION:
*	This program tracks study hours for a week, calculates the total and average,
*	and checks if the user met their weekly goal.
*********************************************
*	ALGORITHM:
*	1. Initialize daily study hours for each day of the week.
*	2. Calculate total hours and average hours per day.
*	3. Compare total hours to the weekly goal.
*	4. Display results using formatted output.
*********************************************
*	STATIC METHODS:
*	- calculateTotal: Calculates the total hours studied.
*	- calculateAverage: Calculates the average hours per day.
*********************************************/

public class Main 
{
  /***** CONSTANT SECTION *****/
  static final int DAYS_IN_WEEK = 7;
  static final double WEEKLY_GOAL = 35.0; // Goal: 35 hours of study per week

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    double mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours;

    /***** INITIALIZATION SECTION *****/
    mondayHours = 5.0;
    tuesdayHours = 4.5;
    wednesdayHours = 6.0;
    thursdayHours = 4.0;
    fridayHours = 5.5;
    saturdayHours = 7.0;
    sundayHours = 3.0;

    /***** PROCESSING SECTION *****/
    double totalHours = calculateTotal(mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours);
    double averageHours = calculateAverage(totalHours);

    /***** OUTPUT SECTION *****/
    System.out.printf("Total Study Hours: %.2f hours%n", totalHours);
    System.out.printf("Average Hours per Day: %.2f hours%n", averageHours);
    if (totalHours >= WEEKLY_GOAL) {
      System.out.println("Great job! You met your weekly study goal!");
    } else {
      System.out.printf("Keep going! You need %.2f more hours to meet your goal.%n", WEEKLY_GOAL - totalHours);
    }
  }

  /***** STATIC METHODS *****/
  public static double calculateTotal(double mon, double tue, double wed, double thu, double fri, double sat, double sun) {
    return mon + tue + wed + thu + fri + sat + sun;
  }

  public static double calculateAverage(double totalHours) {
    return totalHours / DAYS_IN_WEEK;
  }
}