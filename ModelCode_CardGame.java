package coe3sm4_lab0;

public class ModelCode_CardGame {

    public static final int POCKETSIZE = 25;

    public static CardPool myCardPool; 
    public static Card[] myCards;
    public static int pocketSize = POCKETSIZE;
      
    public static void sortCards()
    {
        // implement your favourite sorting algorithm to sort all the cards in their RANK
    }

    public static void main(String args[]) throws Exception
    {
        myCardPool = new CardPool();        
        myCardPool.printPool();

        myCards = new Card[pocketSize];
        myCards = myCardPool.getRandomCards(pocketSize);    
        
        sortCards();

        System.out.println("My Pocket Cards are:");
        for(int j = 0; j < pocketSize; j++)
        {            
            myCards[j].printCard();
        }
        System.out.println();
    }

}
