import javax.swing.JOptionPane;
/**
 * Program Purpose: To calculate and display the gross pay for an employee
 * for a given pay cycle
 * Program inputs: #1. Length of cycle in weeks (monthly=4 or fortnightly=2)
 * 				   #2. Number of hours worked per week
 * 				   #3. Hourly Wage Rate
 * Processing tasks: #1. Calculate the employee's gross pay by
 * 						 multiplying input #1, input #2, and input #3
 * 						and display calculated gross pay back to the user
 * 					 #2. Exit the application
 * Program outputs: #1. Display the employee's gross pay for the pay cycle
 * 						to the user
 */

/**
 * @author Owner
 *
 */
public class GrossPayCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare the program's variables (3 input and 1 output)
		 int lengthOfPayCycleInWeeksInteger;
		 int numberOfHoursWorkedPerWeekInteger;
		 double hourlyWageRateDouble;
		 double employeeGrossPayDouble;
		 
		 
		
		
		// Java code to display input dialog #1 for user input #1
		 lengthOfPayCycleInWeeksInteger = Integer.parseInt(JOptionPane.showInputDialog("Enter "
				 	+ "of pay cycle in weeks: "));
		
		// Java code to display input dialog #2 for user input #2
		 numberOfHoursWorkedPerWeekInteger = Integer.parseInt(JOptionPane.showInputDialog("Enter "
				 	+ "number of hours worked per week: "));
		
		// Java code to display input dialog #3 for user input #3
		 hourlyWageRateDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter "
				 	+ "hourly wage rate: "));
		 // convert pseudocode to Java code
		 // Psuedocode: Calculate the employee's gross pay by multiplying the length of pay cycle
		 // in weeks (monthly=4 or fortnightly=2), the number of hours worked per week, and the
		 // hourly wage rate
		 
		 employeeGrossPayDouble = lengthOfPayCycleInWeeksInteger * numberOfHoursWorkedPerWeekInteger 
				 					* hourlyWageRateDouble;
		 //convert psuedocode to Java code
		 //Psuedocode: Display the calculated gross pay back to the user (using a message box)
		 JOptionPane.showMessageDialog(null, "Employee's Gross Pay is $ " +  employeeGrossPayDouble);
	}

}
