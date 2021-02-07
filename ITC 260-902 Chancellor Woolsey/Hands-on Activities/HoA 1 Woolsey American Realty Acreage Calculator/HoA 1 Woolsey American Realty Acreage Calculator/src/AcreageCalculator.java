// Add an import statement that will allow us to work with input dialog and message dialogs
import javax.swing.JOptionPane;
/** TO DO 13: Provide the following information
 * Class Name: 		AcreageCalculator.java
 * Class Purpose: 	To design a Java application to convert property area from square feet to acres
 * Programmer Name: Chance Woolsey
 * Date: 			January 26, 2021
*/


/**
 * @author cha1224
 *
 */
public class AcreageCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add all code here...
		
		//Declare the variables here using the form "datatype variableName;"
		double inputSquareFeetOfThePropertyDouble; // input #1
		double acreageOfThePropertyDouble; // processing #1
		String outputMessageString; //output #1
		
		// 15.a. Get input square feet value from the user using an input dialog box.
		// 15.b. b.	Store the value input by the user in the appropriate variable 
		inputSquareFeetOfThePropertyDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter "
				+ "the square feet of the property:"));
		
		// 15.c.	Calculate the acreage for the given square feet 
		acreageOfThePropertyDouble = inputSquareFeetOfThePropertyDouble / 43560;
		
		// 15.d. Store the result in the appropriate variable you declared in Step 14. 
		// Use string concatenation to concatenate strings in order to display the output 
		// message as shown in the program output in Step 21
		outputMessageString = "Acreage is: " + acreageOfThePropertyDouble;
		
		// 15.e. e.	Display the output message string back to the user using a show message dialog box
		JOptionPane.showMessageDialog(null, outputMessageString);
		
		
		
		
	} // End of the main() method

} // End of the class 
