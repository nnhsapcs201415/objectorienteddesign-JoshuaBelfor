import java.util.ArrayList;
import java.util.Collections;
/**
   A coin with a monetary value.
*/
public class Coin implements Comparable<Coin>
{
   private double value;
   private String name;

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }
   
   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }
   
   public String toString()
   {
       return "name: " + this.name + "; value: " + this.value;
   }
   
   /**
    * Compares two Coin object
    * 
    * @param otherObject    the object to be compared
    * @return a negative integer, zero, or a positive integer if this coin is less than, equal to or greater than the specified coin.
    * 
    */
   public int compareTo( Coin other )
   {  
       if( this.value < other.value )
       {
           return -1;
       }
       else if (this.value> other.value )
       {
           return 1;
       }
       else
       {
           return 0;
       }
   }
   public static void testComparable()
   {
       Coin quarter = new Coin(.025, "quarter");
       Coin dime = new Coin(.020, "dime");
       Coin nickel = new Coin(.005, "nickel");
       
       ArrayList<Coin> list = new ArrayList<Coin>();
       
       list.add(quarter);
       list.add(dime);
       list.add(nickel);
       
       System.out.println( list );
       
       Collections.sort( list );
       
       System.out.println( list ); 
   }
}
