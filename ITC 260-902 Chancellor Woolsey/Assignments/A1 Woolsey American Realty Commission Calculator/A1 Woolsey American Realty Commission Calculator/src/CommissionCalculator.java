import javax.swing.JOptionPane;
/** TO DO 13: Provide the following information
 * Class Name: 		CommissionCalculator.java
 * Class Purpose: 	To design a Java application to calculate real estate commission on real estate transactions 
 * 				  	(buying a house, selling a house, etc.) for both the agency as well as the agent.
 * Programmer Name: Chance Woolsey
 * Date: 			January 26, 2021
*/


/**
 * @author cha1224
 *
 */
public class CommissionCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare all variables here using camel case with data type preceding it
		double inputPropertySalePriceInDollarsDouble;
		double americanRealtyAgencyCommissionDouble;
		String outputAgencyCommissionString;
		double realtyAgentCommissionDouble;
		String outputRealtyAgentCommissionString;
		
		//15.a.	Get input property sale price value from the user using an input dialog box.
		//15.b.	Store the value input by the user in the appropriate variable 
		inputPropertySalePriceInDollarsDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter the property sale price in dollars: "));
		
		//15.c.	Calculate the agency commission for the given property sale price 
		americanRealtyAgencyCommissionDouble = inputPropertySalePriceInDollarsDouble * 0.06;
		
		//15. d.Store the result in the appropriate variable you declared in Step 14. Use 
		// 	  string concatenation to concatenate strings in order to display the output 
		//    message as shown in the program output in Step 22.
		outputAgencyCommissionString = "The American Realty agency commission is: $" + americanRealtyAgencyCommissionDouble;
		
		//15.e.	Display the output message string back to the user using a show message dialog box.
		JOptionPane.showMessageDialog(null, outputAgencyCommissionString);
		
		//15.f.	Calculate the agent commission for the given agency commission 
		realtyAgentCommissionDouble = americanRealtyAgencyCommissionDouble * 0.4;
		
		//15.g.	Store the result in the appropriate variable you declared in Step 14. 
		//Use string concatenation to concatenate strings in order to display the output 
		//message as shown in the program output in Step 22.
		outputRealtyAgentCommissionString = "Agent commission is: $" + realtyAgentCommissionDouble;
		
		//15.h.	Display the output message string back to the user using a show message dialog box.
		JOptionPane.showMessageDialog(null, outputRealtyAgentCommissionString);
	
	
	}

}
