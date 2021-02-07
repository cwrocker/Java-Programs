import javax.swing.JOptionPane;
import java.lang.Math;
/**
 * 
 */

/**
 * @author Chance Woolsey
 *
 */
public class KeplerOrbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inputSemiMajorAxis;
		double inputMassObjectOne;
		double inputMassObjectTwo;
		double sumOfMassesOfTwoObjects; // takes the inputs of inputMassObjectOne and inputMassObjectTwo
		double denominatorPart; // takes sumOfMassesOfTwoObjects and multiplies  by grav constant
		double timePeriodSquared;//processes inputSemiMajorAxis and sumOfMassesOfTwoObjects
		double realTimePeriod; //this is the square root of timePeriodSquared
		String outputResult;
		
		inputSemiMajorAxis = Double.parseDouble(JOptionPane.showInputDialog("What is the semi-major"
				+ " axis? "));
		inputMassObjectOne = Double.parseDouble(JOptionPane.showInputDialog("What is the mass"
				+ " of the larger object? "));
		inputMassObjectTwo = Double.parseDouble(JOptionPane.showInputDialog("What is the mass"
				+ " of the smaller object? "));
		sumOfMassesOfTwoObjects = inputMassObjectOne + inputMassObjectTwo;
		denominatorPart = Math.pow(6.6726, -11) * sumOfMassesOfTwoObjects;
		timePeriodSquared = 4 * Math.pow(Math.PI, 2) * Math.pow(inputSemiMajorAxis, 3)
							/denominatorPart;
		realTimePeriod = Math.sqrt(timePeriodSquared);
		outputResult = "The amount of earth years it takes for one orbit is " + realTimePeriod;
		JOptionPane.showMessageDialog(null, outputResult);
	}

}
