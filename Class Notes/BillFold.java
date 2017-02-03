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
   
   public BillFold()
   {
       Card card1;
       Card card2;
   }
   
   public void addCard(Card card)
   {
       if (card1 == null)
       {
           card1 = card;
       }
       else if (card2 == null)
       {
           card2 = card;
       }
       
   }
   
   public String formatCards()
   {
       String msg = "";
       if(card1  != null)
       {
           msg += card1.format();
       }
       msg += "\n\n";
       if(card2 != null)
       {
           msg += card2.format();
       }
       return msg;
   }

}