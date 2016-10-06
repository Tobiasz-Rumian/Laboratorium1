import javax.swing.*;

/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie2
{
    private static int a=0,b=0,c=0;
    private static float discriminant =0f;
    private static double root1=0f,root2=0f;
    public Zadanie2() {}
    public static void quadraticEquation()
    {
        a=TryInputDialog.fromInt("Podaj a");
        b=TryInputDialog.fromInt("Podaj b");
        c=TryInputDialog.fromInt("Podaj c");
        if(a!=0)
        {
            discriminant();
            roots();
        }
        else
        {
            System.out.println("a=0!");
            return;
        }
    }
    private static void discriminant()
    {
        discriminant = b*b-(4*a*c);
    }
    private static void roots()
    {
        if(discriminant>0)
        {
            root1=((-b)+Math.sqrt(discriminant))/(2*a);
            root2=((-b)-Math.sqrt(discriminant))/(2*a);
        }
        if(discriminant==0)
        {
            root1=(-b)/(2*a);
            root2=(-b)/(2*a);
        }
    }
    public static void show()
    {
        System.out.println("----------");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("delta: "+discriminant);
        if(discriminant>=0)
        {
            System.out.println("x1: "+root1);
            System.out.println("x2: "+root2);
        }
        else
        {
            System.out.println("delta mniejsza od 0, brak pierwiastkow");
        }
        JOptionPane.showMessageDialog(null,"delta: "+discriminant);
        if(discriminant>=0)
        {
            JOptionPane.showMessageDialog(null,"x1: "+root1);
            JOptionPane.showMessageDialog(null,"x2: "+root2);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"delta mniejsza od 0, brak pierwiastkow");
        }

    }
}
