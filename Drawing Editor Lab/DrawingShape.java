import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
public abstract class DrawingShape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    /**
     * Constructor of the class
     */
    public DrawingShape( Point2D.Double ce, double r, Color c )
    {
        this.center = ce;
        this.radius = r;
        this.color = c;
    }

    /**
     * Returns the center of the shape
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * Returns the radius of the object
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * Returns the color of the object
     */
    public Color getColor()
    {
        return this.color;
    }
    
    /**
     * Moves the shape by (x, y)
     * 
     * @param x the x-position
     * @param y the y-position
     */
    public void move( double x, double y )
    {
        this.center.setLocation( x, y );
    }
    
    /**
     * Sets the radius of the instance variable
     * 
     * @param r the new radius of the object
     */
    public void setRadius( double r )
    {
        this.radius = r;
    }
    
    /**
     * Returns true if the two shapes are equal to each other
     */
    public boolean compareTo( DrawingShape shape )
    {
        if ( this.center == shape.getCenter() &&
             this.radius == shape.getRadius() &&
             this.color == shape.getColor() )
        {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns true if the point lies inside this shape, false otherwise
     * 
     * @param point checks to see if the point is within the object
     */
    public abstract boolean isInside( Point2D.Double point );
    
    /**
     * Returns true if the point liesapproximately on the border 
     *      of this shape, false otherwise
     *      
     * @param point the point to check and see if it on the border
     */
    public abstract boolean isOnBorder( Point2D.Double point );
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, 
     *      and a hollow shape otherwise
     *      
     * @param g2 the graphics object
     * @param filled false, then will draw a filled shape
     */
    public abstract void draw( Graphics2D g2, boolean filled );
    
}















