public class ModelCode_CardGame {

    public static final int POCKETSIZE = 25;

    public static CardPool myCardPool; 
    public static Card[] myCards;
    public static int pocketSize;
      
    public static void sortCards()
    {
        // implement your favourite sorting algorithm to sort 
        // all the cards in their RANK in ASCENDING ORDER

        // must use pocketSize (the variable), NOT the POCKETSIZE (the constant) for sorting iteration bound
    }

    public static void main(String args[]) throws Exception
    {
        pocketSize = POCKETSIZE;

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
