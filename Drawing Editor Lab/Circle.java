import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends DrawingShape
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    //drawCircle(50,50,20);
    /**
     * Default constructor for objects of class Square
     */
    public Circle(Color c, Point2D.Double c2, double r)
    {
        super( c, c2 ,r);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double( 
            super.getCenter().getX() - super.getRadius(), super.getCenter().getY() - super.getRadius(),
                super.getRadius(), super.getRadius());
        if (filled == true)
        {
            g2.fill(circle);
        }
        else
        {
            g2.draw(circle);
        }
    }

    /**
     * @param Point2D.Double    the location of the point to test
     * 
     * @return  boolean true or false depending upon wether or not the point is inside the borders
     */
    public boolean isInside(Point2D.Double point)
    {
        double pointP = Math.sqrt( Math.pow( Math.abs( super.getCenter().getX() - point.getX()), 2
            )+ (Math.pow( Math.abs( super.getCenter().getY() - point.getY()), 2
            )));
        if(point.getX() > pointP)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * 
     * @param Point2D.Double    the location of the point to test
     * 
     * @return boolean     true or false depending on if the graphic is on the border.
     */
    public boolean isOnBorder(Point2D.Double point)
    {
        if(point.getX() == super.getCenter().getX() - this.getRadius() ||
              point.getX() == super.getCenter().getX() + this.getRadius() &&
              point.getY() >= super.getCenter().getY() - this.getRadius() &&
              point.getY() <= super.getCenter().getY() + this.getRadius() )
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}    

