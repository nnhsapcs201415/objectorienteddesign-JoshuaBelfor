import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
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
        this.panel.setBackground(Color.BLUE);
        //
        // ... create and add buttons and selected color panel
        //
        
    }

    //
    // ... create inner class that implements the ActionListener interface to respond to button clicks
    //
}
