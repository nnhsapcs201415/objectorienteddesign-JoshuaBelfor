
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private int expYear;
    
    /**
     * Constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, int expYear)
    {
        super(n);
        this.expYear = expYear;
    }
    
   /**
    * 
    * 
    * @return   String  A string of the format layout of the card
    */
   public String format()
   {
       String s = super.format();
       return s + " Expiration Year: " + this.expYear;
    }    
}
