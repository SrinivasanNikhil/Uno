
public class SpecialCard extends Card{

	private String typeofCard;
	
	
	public SpecialCard(String color, String typeofCard) {
		super(color);
		this.setTypeOfCard(typeofCard);
	}

	
	public String printDetails()
	{
		return " Type: " + this.getTypeOfCard() + "; Color: " + this.getColor(); 
	}


	public String getTypeOfCard() {
		return typeofCard;
	}


	public void setTypeOfCard(String typeofCard) {
		this.typeofCard = typeofCard;
	}
	
	public String developName()
	{
		return this.getTypeOfCard()+"Of"+this.getColor();
	}
	
}
