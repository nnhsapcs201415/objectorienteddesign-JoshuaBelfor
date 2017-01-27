
/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
   private int[] combo = new int[3];
   private boolean[] check = new boolean[3];
   private int dial;
   private int count = 0;
   
    public ComboLock (int secret1, int secret2, int secret3)
   {
       this.combo[0] = secret1;
       this.combo[1] = secret2;
       this.combo[2] = secret3;
    
   }
   
   public void reset()
   {
       this.dial = 0;
   }
   
   public void turnLeft(int ticks)
   {
       if(ticks > 40)
       {
           this.check[1] = false;
        }
        else if(ticks > 40-this.dial)
       {
           this.dial = ticks - 40 - this.dial;
           
       }
       else
       {
           this.dial = ticks + this.dial;
       }
       if (this.dial == combo[this.count])
       {
           this.check[this.count] = true;
       }       
       else
       {
           this.check[this.count] = false;
        }
       this.count++;
   }
   
   public void turnRight( int ticks )
   {
       if(ticks > 40)
       {
           this.check[0] = false;
        }
        else if(ticks > this.dial)
       {
           this.dial = 40 + this.dial - ticks;
           
       }
       else
       {
       this.dial = this.dial - ticks;
       }
       if (this.dial == combo[this.count])
       {
           this.check[this.count] = true;
       }       
       else
       {
           this.check[this.count] = false;
        }
       this.count++;
    
   }
   
   public boolean open()
   
   {
       boolean isOpen;
       if (this.check[0] == true && this.check[1] == true && this.check[2] == true)
       {
           isOpen = true;
       }
       else
       {
           isOpen = false;
       }
       
       return isOpen;
   }
}
   