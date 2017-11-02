import java.util.*;

public class Deck {

	private Card thisCard;
	private ArrayList<Card> thisDeck; 
	private ArrayList<String> colors;
	private ArrayList<String> values;
	
	public Deck() {

	values = new ArrayList<String>();
	colors = new ArrayList<String>();
	thisDeck = new ArrayList<Card>();
	initializeValues();
	initializeColors();
	createDeck();
	}
	
	
	private void initializeValues()
	{
		values.add("One");
		values.add("Two");
		values.add("Three");
		values.add("Four");
		values.add("Five");
		values.add("Six");
		values.add("Seven");
		values.add("Eight");
		values.add("Nine");	
	}
	
	private void initializeColors()
	{
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Blue");
	}
	
	public void createDeck()
	{
		
		for(String color: colors)
		{
			thisCard = new RegularCard(color, "Zero");
			thisDeck.add(thisCard);
			
			for(String value: values)
			{
				thisCard = new RegularCard(color,value);
				thisDeck.add(thisCard);
			}
			
			thisCard = new SpecialCard(color, "Skip a Turn");
			thisDeck.add(thisCard);
			thisCard = new SpecialCard(color, "Take Two");
			thisDeck.add(thisCard);
			thisCard = new SpecialCard(color, "Reverse");
			thisDeck.add(thisCard);
			
			for(String value: values)
			{
				thisCard = new RegularCard(color,value);
				thisDeck.add(thisCard);
			}
			
			thisCard = new SpecialCard(color, "Skip a Turn");
			thisDeck.add(thisCard);
			thisCard = new SpecialCard(color, "Take Two");
			thisDeck.add(thisCard);
			thisCard = new SpecialCard(color, "Reverse");
			thisDeck.add(thisCard);
			
		}
		
		for(int i=0; i<=4; i++){
		thisCard = new SpecialCard("black", "Wild Change Color to");
		thisDeck.add(thisCard);
		thisCard = new SpecialCard("black", "Draw Four");
		thisDeck.add(thisCard);
		}
		
		
	}
	
	public ArrayList<Card> getDeck()
	{
		return thisDeck;
	}
	
	public int size()
    {
        return thisDeck.size();
    }
    
    public Card returnCard(int pIndex)
    {
        return thisDeck.get(pIndex);   
    }
    
    public void removeCard(int pIndex)
    {
        thisDeck.remove(pIndex);        
    }

//end of class	
}
