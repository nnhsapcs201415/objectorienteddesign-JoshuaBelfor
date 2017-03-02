import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingPanel extends JPanel
{
    private ArrayList<DrawingShape> objects;
    Color fillColor;
    

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
     this.objects = new ArrayList<DrawingShape>();    
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
    public void paintComponent(Graphics g)
    {
        for (DrawingShape shape: objects )
        {
            shape.draw( (Graphics2D) g, false);
        }
        repaint();
    }
    
    public void addSquare()
    {
        
    }
    
    public void addCircle()
    {
    
    }

    
}
