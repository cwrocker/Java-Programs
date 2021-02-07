import javax.swing.JOptionPane;
import java.lang.Math;
/**
 * 
 */

/**
 * @author Owner
 *
 */
public class DodecahedronSurfaceAreaCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inputDodEdge;
		double dodSurfaceArea;
		String outputResult;
		
		inputDodEdge = Double.parseDouble(JOptionPane.showInputDialog("What is the surface area edge? "));
		dodSurfaceArea = 3 * Math.pow(inputDodEdge, 2) * Math.sqrt(5*(5 + 2 * Math.sqrt(5)));
		outputResult = "The surface area of this dodecahedron is: " + dodSurfaceArea;
		JOptionPane.showMessageDialog(null, outputResult);
	}

}
