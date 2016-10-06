/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie8
{
    private static int n=0;
    private static double pi=0;
    public Zadanie8(){}
    public static void show()
    {
        n=TryInputDialog.fromInt("Podaj n");
        if(n>3)
        {
            double x=0;
            for(int i=3;i<=n;i++)
            {
                int y = 1;
                for (int j=1; j<=i-2; j++)
                {
                    y *= j;
                }
                x+=y-(i*Math.floor(y/i));
            }
            pi=x-1;
            System.out.println("----------");
            System.out.println("Ilosc liczb pierwszych: "+pi);
        }
        else
        {
            System.out.println("----------");
            System.out.println("Nieprawidlowa liczba! (<=3");
        }

    }
}
