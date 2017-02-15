import java.awt.event.MouseEvent;
class MPL2 implements MouseListener
{
    public void mousePressed(MouseEvent event)
    {
        int x = event.getX();
        int y = event.getY();
        TriangleComponent tri = new TriangleComponent();
    }
    // Do-nothing methods
    public void mouseReleased(MouseEvent event) 
    {
    }

    public void mouseClicked(MouseEvent event) 
    {
    }

    public void mouseEntered(MouseEvent event) 
    {
    }

    public void mouseExited(MouseEvent event) 
    {
    }
}