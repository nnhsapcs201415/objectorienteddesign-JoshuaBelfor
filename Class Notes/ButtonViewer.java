import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * This class demonstrates how to install an action listener.
 * 
 * @author jebelfor 
 * @version 2.8.2017
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    public static void main(String[] args)
    {
        //1. define and set up the UI compnents
        JFrame frame = new JFrame();
        JButton button = new JButton( "Click Me!" );
        frame.add( button );
        
        //2. Create listener objects
        ActionListener listener = new ClickListener();
        
        //3. Register listener object with component that generates events.
        button.addActionListener( listener );
        
        //4. configure the frame and show it
        
        frame.setSize( FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setVisible( true );
    }
}
