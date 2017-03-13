import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class Circle here.
 * 
 * @author jebelfor
 * @version 1
 */
public class Circle extends DrawingShape
{
    /**
     * Constructor for the Circle Class
     */
    public Circle( Point2D.Double ce, double r, Color c )
    {
        super( ce, r, c );
    }
    
    /**
     * This method will reutnr true if the point is within the shape
     * 
     * @param point the point to check
     */
    public boolean isInside( Point2D.Double point )
    {
        double pointH = Math.sqrt( (Math.pow( Math.abs( super.getCenter().getX()
                - point.getX() ), 2 )) + (Math.pow( Math.abs( super.getCenter().
                getY() - point.getY() ), 2 )));
                
        if ( super.getRadius() > pointH )
        {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will return true if the point is on the border of the circle
     * 
     * @param point the point to check
     */
    public boolean isOnBorder( Point2D.Double point )
    {
        double pointH = Math.sqrt( (Math.pow( Math.abs( super.getCenter().getX()
                - point.getX() ), 2 )) + (Math.pow( Math.abs( super.getCenter().
                getY() - point.getY() ), 2 )));
                
        if (super.getRadius() == pointH )
        {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Draws the shape. Draws a filled shape if filled is true, and
     *      a hollow shape otherwise
     */
    public void draw( Graphics2D g2, boolean filled )
    {
        g2.setColor( super.getColor() );
        Ellipse2D circle = new Ellipse2D.Double( 
                           super.getCenter().getX() - super.getRadius(),
                           super.getCenter().getY() - super.getRadius(),
                           super.getRadius(), super.getRadius() );
                           
        if ( filled == true )
        {
            g2.fill( circle );
        } else {
            g2.draw( circle );
        }
    }
}










