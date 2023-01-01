import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String Title)
    {
        Frame fobj = new Frame(Title);
        fobj.setSize(500,500);
        fobj.setVisible(true);

        fobj.addWindowListener(new MarvellousListener());

    }
}
class MarvellousListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj){}


}
class GUI3
{
    public static void main(String arg[])
    {
        MarvellousFrame obj =new MarvellousFrame("Marvellous PPA41");
        

    }
}