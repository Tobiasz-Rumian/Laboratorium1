
/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie4
{
    private static int width=0;
    private static int height=0;
    public Zadanie4(){}
    public static void show()
    {
        width=TryInputDialog.fromInt("Podaj szerokość");
        height=TryInputDialog.fromInt("Podaj wysokość");
        System.out.println("----------");
        for(int i=1;i<=height;i++)
        {
            for(int j=1;j<=width;j++)
            {
                System.out.printf("%3d\t",i*j);
            }
            System.out.printf("%n");
        }
    }
}
