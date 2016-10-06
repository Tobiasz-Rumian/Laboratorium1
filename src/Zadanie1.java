import javax.swing.*;

/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie1
{
    private static String nazwisko="";
    private static String imie="";
    private static int wiek=0;
    private static float srednia_ocena=0f;
    public Zadanie1() {}
    public static void create()
    {
        nazwisko = TryInputDialog.fromString("Podaj swoje nazwisko");
        imie = TryInputDialog.fromString("Podaj swoje imię");
        wiek = TryInputDialog.fromInt("Podaj swój wiek");
        srednia_ocena = TryInputDialog.fromFloat("Podaj swoją średnią ocen");
    }
    public static void show()
    {
        System.out.println("----------");
        System.out.println("Twoje nazwisko: "+nazwisko);
        System.out.println("Twoje imie: "+imie);
        System.out.println("Twoj wiek: "+wiek);
        System.out.println("Twoja srednia ocen: "+srednia_ocena);
        JOptionPane.showMessageDialog(null,"Twoje nazwisko: "+nazwisko);
        JOptionPane.showMessageDialog(null,"Twoje imię: "+imie);
        JOptionPane.showMessageDialog(null,"Twój wiek: "+wiek);
        JOptionPane.showMessageDialog(null,"Twoja średnia ocen: "+srednia_ocena);
    }

}
