import javax.swing.JFrame;

/**
This program displays a rectangle that can be moved with the mouse.
 */
public class TriangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new TriangleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}