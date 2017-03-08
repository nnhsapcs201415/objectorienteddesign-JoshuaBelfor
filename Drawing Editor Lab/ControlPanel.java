import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    private JPanel panel;
    private DrawingPanel canvas;
    private JButton circleB;
    private JButton squareB;
    private JButton colorPickerB;
    private ArrayList<DrawingShape> objects;
    private Color cColor;
    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel canvas)
    {
        this.canvas = canvas;
        
        
        this.circleB = new JButton("Add Circle");
        add( this.circleB );
        this.squareB = new JButton("Add Square");
        add( this.squareB );
        this.colorPickerB = new JButton("Choose Color");
        add( this.colorPickerB );
        this.panel = new JPanel(); 
        //
        // ... create and add buttons and selected color panel
        //
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed( ActionEvent event ) 
            {
                if (event.getSource() == circleB )
                {
                    canvas.addCircle();
                }
                else if (event.getSource() == squareB )
                {
                    canvas.addSquare();
                }
                else
                {
                    canvas.pickColor();
                    cColor = canvas.getColor();
                    panel.setBackground(cColor);
                    
                }
                 
            }
        };
    }
    public void addCircle()
    {
        
        
    }
    
    public void addSquare()
    {
        Point2D.Double center = new Point2D.Double(200,200);
        Square square = new Square(cColor, center, 20);
    }
}
