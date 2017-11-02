/*
 * This is an abstract generic card class. This card class is used to initialize a card object that has 
 * a value and color. 
 */

public abstract class Card {

	private String color;
	
	public Card(String color)
	{
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract String printDetails();

	public abstract String developName();
}
