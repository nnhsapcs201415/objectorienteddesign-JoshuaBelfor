
/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private String callingNumber;
    private int PINNum;
    /**
     * 
     */
   public CallingCard(String n, String num, int PIN)
   {
       super(n);
       callingNumber = num;
       PINNum = PIN;
       
   }
   
   /**
    * 
    * 
    * @return   String  A string of the format layout of the card
    */
   public String format()
   {
       String s = super.format();
       return s + " Calling Number: " + this.callingNumber + " PIN Number: " + this.PINNum;
    }
}
