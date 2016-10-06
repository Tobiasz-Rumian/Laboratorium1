/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie3
{
    public Zadanie3(){}
    public static void show()
    {
        System.out.println("----------");
        int j=0;
        for(int i=32;i<127;i++)
        {
            if(j==5)
            {
                j=0;
                System.out.printf("%n");
            }
            System.out.printf("%3d=%1s\t",i,Character.toString((char)i));
            j++;
        }
        System.out.printf("%n");
    }
}
