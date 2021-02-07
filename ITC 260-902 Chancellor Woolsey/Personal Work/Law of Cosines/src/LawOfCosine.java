import javax.swing.JOptionPane;
import java.lang.Math;
/**
 * Purpose:
 * 
 */

/**
 * @author Owner
 *
 */
public class LawOfCosine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare all variables here using camel case
		double inputAngleADouble;
		double inputLineBDouble;
		double inputLineCDouble;
		double aDouble;
		double squareADouble;
		String outputResultString;
		
		//get input of angle A from a user using an input dialog box
		inputAngleADouble = Double.parseDouble(JOptionPane.showInputDialog("What is the value of Angle A? " ));
		
		//get input of line B from a user using an input dialog box
		inputLineBDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the value of Line B? " ));
		
		//get input of line C from a user using an input dialog box
		inputLineCDouble = Double.parseDouble(JOptionPane.showInputDialog("What is the value of Line B? " ));
	
		//build out the law of cosines equation to solve for A
		aDouble = Math.pow(inputLineBDouble, 2) + Math.pow(inputLineCDouble, 2)
					+ 2 * inputLineBDouble * inputLineCDouble * Math.cos(inputAngleADouble);
		
		//square root the value of A
		squareADouble = Math.sqrt(aDouble);
		
		//concatenate the value of a with a string
		outputResultString = "The length of line a is " + squareADouble;
		
		//display the output of line a
		JOptionPane.showMessageDialog(null, outputResultString);
	
	}

}
