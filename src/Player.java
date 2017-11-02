import java.util.*;

public class Player {

	private Card thisCard;
    private HashMap<String,Card> hand;
    private String playerName;
    

    /**
     * Constructor for objects of class Player
     */
    public Player(String pPlayerName)
    {
        hand = new HashMap<String,Card>();
        playerName = pPlayerName;
    }

    public void insert(Card pthisCard)
    {
        hand.put(pthisCard.developName(), pthisCard);
    }

    
    public void play(String name)
    {
        hand.remove(name);
    }

    public int getHandSize()
    {
    	return this.hand.size();
    }
    
    public void printHand()
    {
        for(String key:hand.keySet())
        {
            System.out.println(hand.get(key).printDetails());
        }
    }
    
    public boolean hasValidCard(Card pCard)
    {
    	for(String key:hand.keySet())
    	{
    		if(key.contains(pCard.getColor()))
    		{
    			return true;
    		}
    		if(key.contains(((RegularCard) pCard).getValueOfCard()))
    		{
    			return true;
    		}
    		if(key.contains(((SpecialCard) pCard).getTypeOfCard()))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    
}
