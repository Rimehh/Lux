/**
 * 
 */

/**
 * @author 1241616
 *
 */
public abstract class AbstractCreditCard {
	
	private static final long serialVersionUID = 42031768817L;
	private final cardType CardType;
	private final String number;
	
	public AbstractCreditCard (CardType cardType, String number) throws IllegalArgumentException
	{
		//@TODO: call luhn validation
		
	}
	
	
	//@Override
	public boolean equals (Object obj)
	{

		//same class
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		AbstractCreditCard castCC = (AbstractCreditCard) obj;

		/*type and number are equal*/
		if (
			this.getType().equalsIgnoreCase(castCC.getType())
			&&
			this.getNumber().equalsIgnoreCase(castCC.getNumber())
			)
		return true;
		
					
		
	}


	public String getNumber() {
		return number;
	}

	public cardType getType() {
		return CardType;
	}


	public String toString()
	{
		return cardtype + "*" + number;
		
	}
	
	private String validateLuhnAlgorithm(String number) throws IllegalArgumentException
	{
		number.length()
		if ( (number.charAt(number.length()-1)) ==  
	}
	
}
