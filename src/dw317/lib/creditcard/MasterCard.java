package dw317.lib.creditcard;


public class MasterCard {

	private final String serialVersionUID = "420317768871L";
	
	
	public MasterCard(String number) throws IllegalArgumentException {
		super(CardType.MASTERCARD, validateNumber(number));
	}


	private static String validateNumber(String number) throws IllegalArgumentException {
		if (number.length() != 16){
			return "Invalid Credit card number -- Must consist of 16 numbers";
		} 
		if (number.charAt(0) == 5){
			if (number.charAt(1) == 1 | number.charAt(1) == 2 | number.charAt(1) == 3 | number.charAt(1) == 4 | number.charAt(1) == 5){
				return number;
			}
		
		}
		return "Error";
		
	}
}
