import javax.swing.JOptionPane;
import java.lang.Math;
/**
 * 
 */

/**
 * @author Owner
 *
 */
public class PVOfGrowingAnnuityCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inputFirstPaymentDouble;
		double inputRatePerPeriodDouble;
		double inputGrowthRateDouble;
		int    inputNumberOfPeriodsInt;
		double percentConvertorRatePerPeriod;
		double percentConvertorGrowthRate;
		double gPlusOne;
		double rPlusOne;
		double gOverRDivision;
		double solveTheBrackets;
		double rMinusG;
		double dividePByDifference;
		double solveProblem;
		String outputResultString;
		
		inputFirstPaymentDouble = Double.parseDouble(JOptionPane.showInputDialog("What was the value "
				+ "of your first payment? " ));
		inputRatePerPeriodDouble = Double.parseDouble(JOptionPane.showInputDialog("What is your interest "
				+ "rate per period" ));
		inputGrowthRateDouble = Double.parseDouble(JOptionPane.showInputDialog("What is your growth "
				+ "rate per period" ));
		inputNumberOfPeriodsInt = Integer.parseInt(JOptionPane.showInputDialog("What is the number "
				+ "of periods" ));
		
		percentConvertorRatePerPeriod = inputRatePerPeriodDouble /100;
		percentConvertorGrowthRate = inputGrowthRateDouble /100;
		
		rPlusOne = percentConvertorRatePerPeriod + 1;
		gPlusOne =  percentConvertorGrowthRate  + 1;
		
		gOverRDivision =  gPlusOne / rPlusOne; 
		
		solveTheBrackets = 1 - Math.pow(gOverRDivision, inputNumberOfPeriodsInt);
		
		rMinusG = percentConvertorRatePerPeriod - percentConvertorGrowthRate;
		
		dividePByDifference = inputFirstPaymentDouble/rMinusG;
		
		solveProblem = dividePByDifference * solveTheBrackets;
		
		outputResultString = "The present value is: $" + solveProblem;
		
		JOptionPane.showMessageDialog(null, outputResultString);
	}

}
