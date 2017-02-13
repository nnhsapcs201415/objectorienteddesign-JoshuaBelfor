import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Person here.
 * 
 * @author jebelfor 
 * @version Feb 9, 2017
 */
public class Person implements Comparable<Person>
{
    /*
     * Supply a class Person that implements the Comparable interface. Compare persons
    by their names. Ask the user to input ten names and generate ten Person objects.
    Using the compareTo method, determine the first and last person among them and
    print them. 
     */
    private String name = "";
    /**
     * Constructor for objects of class Person
     */
    public Person(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Name: " + this.name;
    }

    public String getName()
    {
        return this.name;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int compareTo( Person dude )
    {
        return this.name.compareTo(dude.name);
        /*if(this.name.compareTo(dude.getName()) < 0)
        {
        return -1;
        }
        else if (this.name.compareTo(dude.getName()) > 0)
        {
        return 1;
        }
        else
        {
        return 0;
        }
         */
    }
    public static Person firstPerson( Person [] list)
    {
        Person first = list[0];
        return null; //FIX!
    }
    public static void testPerson()
    {
        ArrayList<Person> list = new ArrayList<Person>(10);     
        Scanner s = new Scanner(System.in);
        String name;
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Please enter a Name: ");
            name = s.next();
            Person dude = new Person(name);
            list.add(dude);
        }
        //System.out.println("First: " + firstPerson(list));
        //System.out.println("First: " + lastPerson(list));
    }
}
