import javax.swing.JOptionPane;
import java.lang.Math;
/**
 * Program Purpose: To calculate and display time measured in a moving body 
 * 					relative to a stationary body
 * Program inputs: #1 Time measured on a stationary body 
 * 				   #2 Velocity
 * Processing tasks: #1. Calculate time on a moving body by multiplying time on a 
 * 						a stationary body (input #1) in seconds by the reciprocal of the square root 
 * 						of one minus the velocity (input #2) in meters/second squared over the speed of light
 * 						squared
 * 					#2. Exit the application
 * Program outputs: #1. The dilated time in seconds
 */

/**
 * @author Owner
 *
 */
public class SpecialRelativity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputStationaryTime; //input variable
		double inputVelocity; //input variable
		double dilatedTime; //processing variable
		String outputResult; //output variable
		
		inputStationaryTime = Integer.parseInt(JOptionPane.showInputDialog("Enter the time of the stationary object: "));
		
		inputVelocity = Double.parseDouble(JOptionPane.showInputDialog("Enter the time of the stationary object: "));
		
		// Pseudocode: set the output equal to the square root (figure out how to find the square root of a number in Java)
		dilatedTime = inputVelocity / Math.sqrt((1 - Math.pow(inputVelocity, 2)/ Math.pow(299792458, 2)));
		outputResult = "The dilated time is: " + dilatedTime;
		
		JOptionPane.showMessageDialog(null, outputResult);
		
	}

}
