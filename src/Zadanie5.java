/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie5
{
    private static int a=0,b=0,c=0,d=0,x=0;
    private static double w=0;
    public Zadanie5(){}
    public static void show()
    {
        a=TryInputDialog.fromInt("Podaj a");
        b=TryInputDialog.fromInt("Podaj b");
        c=TryInputDialog.fromInt("Podaj c");
        d=TryInputDialog.fromInt("Podaj d");
        x=TryInputDialog.fromInt("Podaj x");
        w=a*x+b;
        w=w*x+c;
        w=w*x+d;
        System.out.println("----------");
        System.out.println("W("+x+")="+w);
    }
}
