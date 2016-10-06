/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie7
{
    private static float eps=0f;
    private static double S1=0,S2=0,s1=0,s2=0,k=1,k1=1;
    public Zadanie7(){}
    public static void show()
    {
        eps=TryInputDialog.fromFloat("Podaj eps");
        do
        {
            s1=Math.pow((-1),(k+1))*(1/(2*k-1));
            k++;
            S1+=s1;
        }while(4*Math.abs(s1)>eps);
        S1*=4;
        k=0;
        do
        {
            s2=1/k1;
            k++;
            k1*=k;
            S2+=s2;
        }while(Math.abs(s2)>eps);
        System.out.println("----------");
        System.out.println("S1: "+S1);
        System.out.println("S2: "+S2);
    }
}
