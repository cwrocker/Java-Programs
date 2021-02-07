import javax.swing.JOptionPane;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; 
/**
 * Ideas:
 * random number generate so when a 10 comes up it can be a ten, king, queen, or jack
 * 
 * random number generate so if dealer's total is greater than 18 it chooses whether to deal itself more cards (between 0 and 1 random)
 * 
 */

/**
 * @author Owner
 *
 */
public class NumberGuesser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cardOneInt;
		int cardTwoInt;
		int addTotalInt;
		int userGuessInt;
		String cardOneString;
		String cardTwoString;
		boolean cardOneStringIsTenBoolean = false;
		boolean cardTwoStringIsTenBoolean = false;
		//userGuessInt = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1 and 11" ));
		//ThreadLocalRandom.current().nextInt(12) picks a random number between zero and thirteen
		cardOneInt = ThreadLocalRandom.current().nextInt(13);
		cardTwoInt = ThreadLocalRandom.current().nextInt(13);
		//plug in "0" for both variables
		//JOptionPane.showMessageDialog(null, cardOneInt);
		
		
		//sets whatever random number the computer picks to a card value while storing the number
		switch (cardOneInt)
		{
		case 0:cardOneString = "King";
		break;
		case 1:cardOneString = "Ace";
		break;
		case 2:cardOneString = "Two";
		break;
		case 3:cardOneString = "Three";
		break;
		case 4:cardOneString = "Four";
		break;
		case 5:cardOneString = "Five";
		break;
		case 6:cardOneString = "Six";
		break;
		case 7:cardOneString = "Seven";
		break;
		case 8:cardOneString = "Eight";
		break;
		case 9:cardOneString = "Nine";
		break;
		case 10:cardOneString = "Ten";
		break;
		case 11:cardOneString = "Jack";
		break;
		case 12:cardOneString = "Queen";
		break;
		default: cardOneString = "This card is invalid";
		break;
		}
		
		if (cardOneString == "Ten" || cardOneString == "Jack" || cardOneString == "Queen" || cardOneString == "King") {
			cardOneStringIsTenBoolean = true;
		}
		
		if (cardOneStringIsTenBoolean == true) {
			cardOneInt = 10; 
		}
		
		switch (cardTwoInt)
		{
		case 0:cardTwoString = "King";
		break;
		case 1:cardTwoString = "Ace";
		break;
		case 2:cardTwoString = "Two";
		break;
		case 3:cardTwoString = "Three";
		break;
		case 4:cardTwoString = "Four";
		break;
		case 5:cardTwoString = "Five";
		break;
		case 6:cardTwoString = "Six";
		break;
		case 7:cardTwoString = "Seven";
		break;
		case 8:cardTwoString = "Eight";
		break;
		case 9:cardTwoString = "Nine";
		break;
		case 10:cardTwoString = "Ten";
		break;
		case 11:cardTwoString = "Jack";
		break;
		case 12:cardTwoString = "Queen";
		break;
		default: cardTwoString = "This card is invalid";
		break;
		}
		
		if (cardTwoString == "Ten" || cardTwoString == "Jack" || cardTwoString == "Queen" || cardTwoString == "King") {
			cardTwoStringIsTenBoolean = true;
		}
		
		if (cardTwoStringIsTenBoolean == true) {
			cardTwoInt = 10; 
		}
		
		addTotalInt = cardOneInt + cardTwoInt;
		JOptionPane.showMessageDialog(null, "You have the cards " + cardOneString + ", " + cardTwoString + " " + addTotalInt);

		/*
		 * Things to code still (for the computer)
		 * A for or while loop where if the total of the cards is less than 21, we add more cards
		 * 
		 * If the total of the cards reaches 17, the computer will randomly select whether to one more card
		 * 
		 * If the total of the cards reaches 18, the computer will randomly select whether to one more card (with odds
		 * strongly stacked in favor of not adding more cards)
		 * 
		 * If the total reaches 19, the computer will randomly select whether to push his luck (with odds 
		 * strongly stacked in favor of not adding more cards) 
		 * 
		 * If the total reaches 20+ the computer will stand
		 * 
		 * For both:
		 * A statement for if the total with Ace is less than 21, the number becomes an 11, else it is a 1
		 * 
		 * For User:
		 * A method to "give" users their initial cards
		 * A way to handle adding new cards to the user is they say "yes" to "do you want another card"
		 * and error handling if they say anything other than yes or no
		 * 
		 */
		
		//probably need to look into functions, these switch statements are already driving me nuts
	}

}
