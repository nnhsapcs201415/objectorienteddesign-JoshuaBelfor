import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingPanel extends JPanel
{
    Color fillColor;
    private ArrayList<DrawingShape> objectList;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        fillColor = new Color( 255, 0, 0 );
        this.objectList = new ArrayList<DrawingShape>();
    }

    public void addSquare()
    {
        Point2D.Double center = new Point2D.Double( 200, 200 );
        Square square = new Square( center, 50, fillColor );
        this.objectList.add( square );
        repaint();
    }

    public void addCircle()
    {
        Point2D.Double center = new Point2D.Double( 150, 150 );
        Circle circle = new Circle( center, 100, fillColor );
        this.objectList.add( circle );
        repaint();
    }

    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        for ( DrawingShape shape: objectList )
        {
            int i = 1;
            if ( shape.compareTo( objectList.get( objectList.size() - i) ) )
            {
                shape.draw( (Graphics2D) g, false );
            } else {
                shape.draw( (Graphics2D) g, true );
            }
            i++;
        }
    }
    
    /**
     * Invoked when the "Pick Color" button is clicked. Displays a JColorChooser and sets the
     *  selected color as the new fill color. Leaves the fill color unchanged if the user clicks
     *  "Cancel"
     *
     */
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );

        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }

    /**
     * Returns the color of the fillColor
     */
    public Color getColor()
    {
        return this.fillColor;
    }
}
