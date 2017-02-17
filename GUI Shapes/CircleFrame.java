import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 */
public class CircleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private CircleComponent scene;
    public CircleFrame()
    {
        String radiusString = JOptionPane.showInputDialog("Enter a Circle Radius: ");
        int radius = Integer.parseInt(radiusString);
        
        String xPos = JOptionPane.showInputDialog("Enter the X coordinate of the Center: ");
        int x = Integer.parseInt(xPos);
        
        String yPos = JOptionPane.showInputDialog("Enter the Y coordinate of the Center: ");
        int y = Integer.parseInt(yPos);

        /*scene = new CircleComponent();
        add(scene);
        MousePressListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
         */
    }
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.moveTriangleTo(x ,y);
        }

        // Do-nothing methods
        public void mouseReleased(MouseEvent event) {}

        public void mouseClicked(MouseEvent event) {}

        public void mouseEntered(MouseEvent event) {}

        public void mouseExited(MouseEvent event) {}
    }
}
