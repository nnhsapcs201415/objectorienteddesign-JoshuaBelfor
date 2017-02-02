
/**
 * Write a description of class BillFold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillFold
{
    private Card card1;
    private Card card2;
    /**
     * Constructor for objects of class BillFold
     */
    public BillFold()
    {
        ;
    }

    public void addCard(Card card)
    {
        if (card1.equals(null))
        {
            this.card1 = new Card();

        }
        else if (card2.equals(null))
        {
            this.card2 = new Card();
        }
        else
        {
           ;
        }
    }
    public String formatCards()
    {
        return null;
    }
}
