import  javax.swing.JOptionPane;
/*
 * Purpose: To calculate the surface area of a rectangular prism and display its results
 * 			in centimeters cubed
 * Program inputs: #1. Length
 * 				   #2. Width
 * 				   #3. Height
 * Processing tasks: #1. Calculate the surface area by adding twice of input #1 * input #2, twice 
 * 						input #2 * input #3, and twice input #1 * input #3.
 * 					 #2. Exit the Application
 * Program outputs: #1. Display the surface area back to the user
 */
/*
 * @author cha1224
 */

public class RectanglePerimeterCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare the program's variables (3 input and 1 output)
		double inputLengthInCentimeters; //input #1
		double inputHeightInCentimeters; //input #2
		double inputWidthInCentimeters; //input #3
		double totalSurfaceArea; //processing task
		String outputMessageString;  //output #1
		
		//Java code to display input dialog #1 for user input #1
		inputLengthInCentimeters = Double.parseDouble(JOptionPane.showInputDialog("Enter length in centimeters: "));
		
		//Java code to display input dialog #2 for user input #2
		inputHeightInCentimeters = Double.parseDouble(JOptionPane.showInputDialog("Enter height in centimeters: "));
		
		//Java code to display input dialog #3 for user input #3
		inputWidthInCentimeters = Double.parseDouble(JOptionPane.showInputDialog("Enter width in centimeters: "));
		
		//Convert psuedocode to Java code
		//Pseudocode: Calculate the surface area by using the surface area formula
		
		totalSurfaceArea = 2 * inputLengthInCentimeters * inputHeightInCentimeters 
				+ 2 * inputHeightInCentimeters * inputWidthInCentimeters 
				+ 2 * inputLengthInCentimeters * inputWidthInCentimeters;
		
		outputMessageString = "The total surface area is " + totalSurfaceArea + " cm^3";
		
		//Convert pseudocode to Java code
		//Pseudocode:Display the total surface area back to the user
		JOptionPane.showMessageDialog(null, outputMessageString);
	}

}
