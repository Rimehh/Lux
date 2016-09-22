/**
 * 
 */
package dw317.lib.creditcard;

/**
 * @author Sebastian
 *
 */
public abstract class AbstractCreditCard implements CreditCard {
	protected static final long serialVersionUID = 42031768871L;
	protected final CardType cardType;
	protected final String number;

	/**
	 * @param cardType
	 * @param number
	 */
	public AbstractCreditCard(CardType cardType, String number) {
		super();
		this.cardType = cardType;
		this.number = number;
	}

	/**
	 * 
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractCreditCard2 [cardType=" + cardType + ", numbe"
				+ "r=" + number + "]";
	}

	/**
	 * @return the cardType
	 */
	public CardType getType() {
		return cardType;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardType == null) ? 0 : 
			cardType.hashCode());
		result = prime * result + ((number == null) ? 0 : 
			number.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AbstractCreditCard))
			return false;
		AbstractCreditCard other = (AbstractCreditCard) obj;
		if (cardType != other.cardType)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	private String validateLuhnAlgorithm(String number){
		
	}

}
