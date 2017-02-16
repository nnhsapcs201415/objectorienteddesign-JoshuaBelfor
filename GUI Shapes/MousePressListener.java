import java.awt.event.MouseEvent;
class MousePressListener implements MouseListener
{
    public void mousePressed(MouseEvent event)
    {
        int x = event.getX();
        int y = event.getY();
        RectangleComponent2 component = new RectangleComponent2();
        component.moveRectangleTo(x, y);
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