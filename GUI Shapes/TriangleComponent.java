import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Color;
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
        
        for (int i = 0; i <= point; i++)
        {
            Ellipse2D.Double dot = new Ellipse2D.Double(points[i][0] - 3, points[i][1] -3,6,6);
            g2.fill(dot);

            if ( i >= 0 && point > i)
            {
                Line2D.Double line = new Line2D.Double( points[i][0], points[i][1], points[ i + 1][0], points[i+1][1]);
                g2.setColor(Color.black);
                g2.draw(line);
            }
            else if ( i == 2 )
            {
                 Line2D.Double line2 = new Line2D.Double( points[2][0], points[2][1], points[0][0], points[0][1]);
                 g2.setColor(Color.black);
                 g2.draw(line2);
            }

        }
    }
        public void moveTriangleTo(int x, int y)
        {
        point++;
        if (point < 3)
        {
            int[] position = {x,y};
            points[point] = position;

        }
        else if (point == 3)
        {
            this.points = new int[3][2];
            this.point = -1;

        }
        repaint();

    }
}