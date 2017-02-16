import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 */
public class CircleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private CircleComponent scene;
    public CircleFrame()
    {
        scene = new CircleComponent();
        add(scene);
        MousePressListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
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
