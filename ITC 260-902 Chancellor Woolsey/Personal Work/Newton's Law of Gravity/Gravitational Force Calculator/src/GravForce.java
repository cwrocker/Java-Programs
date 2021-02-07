import javax.swing.JOptionPane;
import java.lang.Math;
/*
 * author: cha1224
 */
public class GravForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inputForceOne;
		double inputForceTwo;
		double inputRadius;
		double distanceBetween;
		String outputResult;
		
		inputForceOne = Double.parseDouble(JOptionPane.showInputDialog("What is the mass "
				+ "of object one (in kg)? "));
		inputForceTwo = Double.parseDouble(JOptionPane.showInputDialog("What is the mass "
				+ "of object two (in kg)? "));
		inputRadius = Double.parseDouble(JOptionPane.showInputDialog("What is the distance "
				+ "between the two objects (in meters)? "));
		distanceBetween = Math.pow(6.6726, -11)* inputForceOne * inputForceTwo 
						/ Math.pow(inputRadius, 2);
		outputResult = "The gravitational force is " + distanceBetween;
		
		JOptionPane.showMessageDialog(null, outputResult);
	}

}
