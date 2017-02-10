import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 * This class demonstrates how to install an action listener.
 * 
 * @author jebelfor 
 * @version 2.8.2017
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;
    
    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;
    
    public ButtonViewer()
    {
        //1. define and set up the UI compnents
        this.frame = new JFrame();
        this.panel = new JPanel();
        this.buttonA = new JButton( "A" );
        this.panel.add( this.buttonA );
        
        this.buttonB = new JButton( "B" );
        this.panel.add( this.buttonB );
        
        this.label = new JLabel( "No Button Clicked.");
        //IMPORTANT, DO NOT FORGET LINE BELOW
        this.frame.add(this.label);
        this.frame.add( this.panel );
        
        //2. Create listener objects
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed( ActionEvent event ) 
            {
                 label.setText("Button " + event.getActionCommand() + " was clicked!");
            }
        };
       
        
        //3. Register listener object with component that generates events.
        this.buttonA.addActionListener( listener );
        this.buttonB.addActionListener( listener );
        
        
        //4. configure the frame and show it
        
        this.frame.setSize( FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible( true );
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
