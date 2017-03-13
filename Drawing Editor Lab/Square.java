import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Square extends DrawingShape
{
    /**
     * Constructor of the square class
     */
    public Square( Point2D.Double ce, double r, Color c )
    {
        super( ce, r, c );
    }
    
    /**
     * This method will return true if the point is within the shape
     * 
     * @param point The point to check if it in the object
     */
    public boolean isInside( Point2D.Double point )
    {
        if ( point.getX() > super.getCenter().getX() - this.getRadius() &&
               point.getX() < super.getCenter().getX() + this.getRadius() &&
               point.getY() > super.getCenter().getY() - this.getRadius() &&
               point.getY() < super.getCenter().getY() + this.getRadius() )
        {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns true if the point is on the boarder of the object
     */
    public boolean isOnBorder( Point2D.Double point )
    {
        if (point.getX() == super.getCenter().getX() - this.getRadius() ||
               point.getX() == super.getCenter().getX() + this.getRadius() &&
               point.getY() >= super.getCenter().getY() - this.getRadius() &&
               point.getY() <= super.getCenter().getY() + this.getRadius() )
        {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Draws the shape. Draws a filled shpae if filled is true, and
     *      a hollow shape otherwise
     */
    public void draw( Graphics2D g2, boolean filled )
    {
        g2.setColor( super.getColor() );
        Rectangle2D.Double rect = new Rectangle2D.Double( (int) super.getCenter().getX() 
                - this.getRadius(), (int) super.getCenter().getY() - this.getRadius(),
                150, 150 );
        
        if ( filled == true )
        {
            g2.fill( rect );
        } else {
            g2.draw( rect );
        }
    }
}










