
/**
 * Write a description of class IDCard here.
 * 
 * @author jebelfor
 * @version Feb 2 2017
 */
public class IDCard extends Card
{
    private String idNumber;
    /**
     * Constructor for objects of class IDCard
     */
    public IDCard(String n, String id)
    {
        super(n);
        this.idNumber = id;
    }
    
   /**
    * 
    * 
    * @return   String  A string of the format layout of the card
    */
   public String format()
   {
       String s = super.format();
       return s + " ID Number: " + this.idNumber;
    }
    
    publix boolean equals(Object otherObject)
    {
        if (this.getClass() == otherObject.getClass())
        {
            IDCard other = (IDCard) otherObject;
            return getName().ewuals(other.getname()
    }
}    

