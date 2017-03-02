import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends DrawingShape
{
    /**
     * Default constructor for objects of class Square
     */
    public Square(Color c, Point2D.Double c2, double r)
    {
        super( c, c2 ,r);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2, boolean filled)
    {   Rectangle2D.Double rectangle = new Rectangle2D( (int) super.getCenter().get);
        
    }

    /**
     * @param Point2D.Double    the location of the point to test
     * 
     * @return  boolean true or false depending upon wether or not the point is inside the borders
     */
    public boolean isInside(Point2D.Double point)
    {
        if(point.getX() > super.getCenter().getX() - this.getRadius() &&
        point.getX() < super.getCenter().getX() + this.getRadius() &&
        point.getY() > super.getCenter().getY() - this.getRadius() &&
        point.getY() < super.getCenter().getY() + this.getRadius())
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
