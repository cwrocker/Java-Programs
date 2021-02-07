import javax.swing.JOptionPane;
import java.lang.Math;
/*
 * This is a financial calculator meant to calculate the remaining balance
 * It was written by Chance Woolsey
 * Test Values
 * 
 *  Regular payment: 500
 *	interest rate per period: 3%
 *	number of payments: 12
 *  number of payments already made: 4
 *
 *  Result (without rounding):  
 */

public class RemainingBalanceCalculator {
	
	public static void main (String[] args) {
		//declare variables here in camelCase
		//input variables
		double inputRegularPaymentDouble;
		double inputInterestRatePerPeriodDouble;
		int inputNumberOfPaymentsInt;
		int inputNumberOfPaymentsAlreadyMade;
		//processing variables
		double interestRateOverHundredDouble; //use to convert interest vate to decimal by dividing by 100
		double prepareBaseForUseDouble; //adds 1 to the interest
		int prepareExponentForUseInt; //subtracts number of payments by number of payments already made and makes it the opposite number
		double prepareNumeratorDouble; // solves numerator part of equation
		double finishTheMathDouble; // multiplies the numerator by the regularPayment and divides by interestRateOverHundred	
		//add one more variable to round this answer off
		String outputResultString;
		//taking in input
		inputRegularPaymentDouble = Double.parseDouble(JOptionPane.showInputDialog("What is your regular payment?"));
		inputInterestRatePerPeriodDouble = Double.parseDouble(JOptionPane.showInputDialog("What is your interest rate per period?"));
		inputNumberOfPaymentsInt = Integer.parseInt(JOptionPane.showInputDialog("What is your number of payments remaining?"));
		inputNumberOfPaymentsAlreadyMade = Integer.parseInt(JOptionPane.showInputDialog("What is your number of payments already made?"));
	
		//processing the input
		interestRateOverHundredDouble = inputInterestRatePerPeriodDouble/100;
		prepareBaseForUseDouble = (1 + interestRateOverHundredDouble);
		prepareExponentForUseInt = -(inputNumberOfPaymentsInt - inputNumberOfPaymentsAlreadyMade);
		prepareNumeratorDouble = 1 - Math.pow(prepareBaseForUseDouble, prepareExponentForUseInt);
		finishTheMathDouble = inputRegularPaymentDouble * (prepareNumeratorDouble / interestRateOverHundredDouble);
		
		outputResultString = "The remaining balance is: $" + finishTheMathDouble;
		//delivering the output
		JOptionPane.showMessageDialog(null, outputResultString);
		
	}

}
