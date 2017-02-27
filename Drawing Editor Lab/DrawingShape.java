
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Write a description of abstract class DrawingShape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class DrawingShape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public DrawingShape(Color c, Point2D.Double c2, double r)
    {
        this.center = c2;
        this.radius = r;
        this.color = c;
    }
    
    /**
     * returns the radius of the object
     * 
     *  @return  returns The Radius
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * Returns the pixel location of the center
     * 
     * @return   the objects center
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * returns the color of the object
     * 
     * @return      the color of the object
     * 
     */
    public Color getColor()
    {
        return this.color;
    }
    
    /**
     * Moves the object around the Graphical User Interface
     * 
     * @param  double      the x location where the object will move to
     * @param  double      the y location where the object will move to
     */
    public void move(double x, double y)
    {
        this.center.setLocation(x,y);
    }

    /**
     * sets a radius for the new object
     * 
     * @param  double      the new size of the radius

     */
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    /**
     * @param Point2D.Double    the location of the point to test
     * 
     * @return  boolean true or false depending upon wether or not the point is inside the borders
     */
    public abstract boolean isInside(Point2D.Double point);
    
    /**
     * @param   Graphics2D  a graphical object
     * @param   boolean     true or false depending on if the graphic is filled.
     */
    public abstract void draw(Graphics2D g2, boolean filled);
}
