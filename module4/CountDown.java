package module4;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		
		System.out.println("Countdown:");
		
		while (count >= 0) {
			System.out.println(count + "...");
			count--;
		}
		
		System.out.println("BLAST OFF!");
	}

}
