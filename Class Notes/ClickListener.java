import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This is an action listener that prints a message
 * 
 * @author jebelfor
 * @version Feb 10 2017
 */
public class ClickListener implements ActionListener
{
    public void actionPerformed( ActionEvent event )
    {
        System.out.println( "Button " + event.getActionCommand() + " was clicked" );
    }
}