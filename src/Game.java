import java.util.*;

public class Game {

	private Player player1;
	private Player player2;
	private Deck theDeck;
	private Random randomGen;
	private Card theCard;
	private int turn;
	private boolean keepPlaying;
	private ArrayList<Card> tableDeck;
	
	public Game() {
	
		keepPlaying = true;
		randomGen = new Random();
		player1 = new Player("Hank Lawson");
		player2 = new Player("Frank Lawson");
		theDeck = new Deck();
		startingDeal();
		playGame();
	}
	
	public void playGame() {
        
        turn=1;
        while (theDeck.size() > 0 && player1.getHandSize() > 0 && player2.getHandSize() > 0 && keepPlaying) 
        {
         		playTurn();
             	turn = turn+1;
             	printResult();
        }
         
    }
	
	public void startingDeal()
	{
		for(int i = 1; i<=7; i++)
		{
			int index = randomGen.nextInt(theDeck.size());
			theCard = theDeck.returnCard(index);
			player1.insert(theCard);
			theDeck.removeCard(index);
			
			index = randomGen.nextInt(theDeck.size());
			theCard = theDeck.returnCard(index);
			player2.insert(theCard);
			theDeck.removeCard(index);
		}
		
		int index = randomGen.nextInt(theDeck.size());
		theCard = theDeck.returnCard(index);
		theDeck.removeCard(index);
	}
	
	public void playTurn(int pID)
	{
		if(pID == 1)
		{
			
		}
		if(pID == 2)
		{
			
		}
	}
	
	public void printResult()
	{
		
	}
	
	
	public void printLastCardinTableDeck()
	{
		
	}
	
	
	

}
