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
                 
                    Circle circle = new Circle( g2, false );
                    
                    canvas.add(circle);
                
                }
                else if (event.getSource() == squareB )
                {
                    Graphics2D g2 = new Graphics2D();
                    Circle square = new Circle( g2, false );
                    
                    canvas.add(square);
           
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

}
