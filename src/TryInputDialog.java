import javax.swing.*;

/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class TryInputDialog
{
    public TryInputDialog(){}
    public static String fromString(String string)
    {
        String string1="";
        try
        {
            string1 = JOptionPane.showInputDialog(null,string);
        }
        catch(Exception error)
        {
            error.printStackTrace();
        }
        return string1;
    }
    public static int fromInt(String string)
    {
        int x=0;
        try
        {
            x = Integer.parseInt(JOptionPane.showInputDialog(null,string));
        }
        catch(Exception error)
        {
            error.printStackTrace();
        }
        return x;
    }
    public static float fromFloat(String string)
    {
        float x=0f;
        try
        {
            x = Float.parseFloat(JOptionPane.showInputDialog(null,string));
        }
        catch(Exception error)
        {
            error.printStackTrace();
        }
        return x;
    }
}
