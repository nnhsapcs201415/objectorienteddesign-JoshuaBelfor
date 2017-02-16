import javax.swing.JFrame;

/**
This program displays a rectangle that can be moved with the mouse.
 */
public class CircleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new CircleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}