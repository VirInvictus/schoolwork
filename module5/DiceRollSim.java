package module5;

public class DiceRollSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiDiceRoll(100));
		System.out.println(omniDiceRoll(100, 20));
	}
	
	public static int multiDiceRoll(int noOfDice) {
		int total = 0;
		
		for (int i = 1; i <= noOfDice; i++) {
			total += (int)(Math.random() * 6) + 1;
		}
		
		return total;
	}
	
	public static int omniDiceRoll(int noOfDice, int noOfSides) {
		int total = 0;
		
		for (int i = 1; i <= noOfDice; i++) {
			total += (int)(Math.random() * noOfSides) + 1;
		}
		
		return total;
	}

}
