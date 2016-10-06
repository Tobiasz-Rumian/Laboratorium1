/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie6
{
    private static int a=0,b=0;
    private static double nwd=0,nww=0;
    public Zadanie6(){}
    public static void show()
    {
        a=TryInputDialog.fromInt("Podaj a");
        b=TryInputDialog.fromInt("Podaj b");
        nwd();
        nww=(a*b)/nwd;
        System.out.println("----------");
        System.out.println("Nwd: "+nwd);
        System.out.println("Nww: "+nww);
    }
    private static void nwd()
    {
        int c=0,d=a,e=b;
        while(e != 0)
        {
            c = d % e;
            d = e;
            e = c;
        }
        nwd=d;
    }
}
