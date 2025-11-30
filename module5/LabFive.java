package module5;

public class LabFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCounter("This is a test sentence meant to find letters", 'e'));
		System.out.println(palindromeCheck("civic"));
		System.out.println(reverseString("This should come out backwards."));
		System.out.println(giveAverage(20,31,16));
		System.out.println(vowelRemover("This is a test script to see how it would work."));
	}
	
	public static int letterCounter(String userString, char letter) {
		int count = 0;

		for (int i = 0; i <= userString.length() - 1; i++) {
			if (userString.charAt(i) == letter) {
				count += 1;
			}
		}
		return count;
	}
	
	public static boolean palindromeCheck(String userString) {
		boolean result;
		String reverseString = "";
		
		for (int i = userString.length() - 1; i >= 0; i--) {
			reverseString += userString.charAt(i);
		}
		if (reverseString.equals(userString)) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	public static String reverseString(String userString) {
		String reverseString = "";
		
		for (int i = userString.length() - 1; i >= 0; i--) {
			reverseString += userString.charAt(i);
		}
		
		return reverseString;
	}
	
	public static double giveAverage(double num1, double num2, double num3) {
		double average;
		average = (num1 + num2 + num3) / 3;
		
		return average;
	}
	
	public static String vowelRemover(String userString) {
		String vowellessString = "";
		
		for (int i = 0; i <= userString.length() - 1; i++) {
			if (userString.charAt(i) != 'a' && userString.charAt(i) != 'e' && userString.charAt(i) != 'i' && userString.charAt(i) != 'o' && userString.charAt(i) != 'u') {
				vowellessString += userString.charAt(i);
			}
		}
		
		return vowellessString;
	}

}
