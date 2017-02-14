import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
This component displays a rectangle that can be moved.
8*/
public class TriangleComponent extends JComponent
{
    private int point;
    
    private int[][] points;

    public TriangleComponent()
    {
        this.point = -1;
        this.points = new int[3][2];
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (point >= 0 )
        {
            
        }
        
    }

    public void moveTriangeTo(int x, int y)
    {
        point++;
        if (point < 3)
        {
            int[] position = x,y
            points[point] = position;
            
        }
        else if (point == 3)
        {
            this.points = int[3][2];
            this.point = -1;
        
    }
    
}