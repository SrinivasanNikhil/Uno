
public class RegularCard extends Card {

	public String valueOfCard;
	
	public RegularCard(String color, String value) {
		super(color);
		this.setValueOfCard(value);
	}

	public String getValueOfCard() {
		return valueOfCard;
	}

	public void setValueOfCard(String valueOfCard) {
		this.valueOfCard = valueOfCard;
	}

	public String printDetails()
	{
		return " Value: " + this.getValueOfCard() + " Color: " + this.getColor(); 
	}
	
	public String developName()
	{
		return this.getValueOfCard()+"Of"+this.getColor();
	}
	
}
