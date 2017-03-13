import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;


/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    private DrawingPanel canvas;
    private JButton circle_Button;
    private JButton square_Button;
    private JButton color_Picker;
    private Color currentColor;
    private JPanel panel;
    

    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel canvas)
    {
        this.canvas = canvas;
        
        this.circle_Button = new JButton( "Add Circle" );
        this.square_Button = new JButton( "Add Square" );
        this.color_Picker = new JButton( "Pick Color" );

        this.currentColor = canvas.getColor();
        this.panel = new JPanel();
        panel.setBackground( currentColor );

        add( this.color_Picker );
        add( panel );
        add( this.square_Button );
        add( this.circle_Button );
        
        color_Picker.addActionListener( listener );
        this.square_Button.addActionListener( listener );
        this.circle_Button.addActionListener( listener );
        
        canvas.addMouseListener( mouseListener );

    }
    ActionListener listener = new ActionListener()
        {
            public void actionPerformed( ActionEvent event )
            {
                if (event.getSource() == color_Picker )
                {
                    canvas.pickColor();
                    currentColor = canvas.getColor();
                    panel.setBackground( currentColor );
                } else if (event.getSource() == square_Button )
                {
                    canvas.addSquare();
                } else if (event.getSource() == circle_Button )
                {
                    canvas.addCircle();
                }
            }
        };
    MouseListener mouseListener = new MouseListener()
        {
            public void mousePressed( MouseEvent event )
            {
            }
            
            public void mouseReleased( MouseEvent event ) {}
            public void mouseClicked( MouseEvent event ) {}
            public void mouseEntered( MouseEvent event ) {}
            public void mouseExited( MouseEvent event ) {}
        };
        

}

