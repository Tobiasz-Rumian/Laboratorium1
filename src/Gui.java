import javax.swing.*;
import java.io.PrintStream;

/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Gui extends JFrame
{
    private JPanel mainWindow;
    private JButton zadanie1Button;
    private JButton zadanie2Button;
    private JButton zadanie3Button;
    private JButton zadanie4Button;
    private JButton zadanie5Button;
    private JButton zadanie6Button;
    private JButton zadanie7Button;
    private JButton zadanie8Button;
    private JButton zadanie9Button;
    private JTextArea consoleOut;

    public Gui()
    {
        setContentPane(mainWindow);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        PrintStream printStream = new PrintStream(new CustomOutputStream(consoleOut));
        System.setOut(printStream);
        System.setErr(printStream);


        zadanie1Button.addActionListener(e ->
        {
            Zadanie1.create();
            Zadanie1.show();
        });
        zadanie2Button.addActionListener(e ->
        {
            Zadanie2.quadraticEquation();
            Zadanie2.show();
        });
        zadanie3Button.addActionListener(e ->
        {
            Zadanie3.show();
        });
        zadanie4Button.addActionListener(e ->
        {
            Zadanie4.show();
        });
        zadanie5Button.addActionListener(e ->
        {
            Zadanie5.show();
        });
        zadanie6Button.addActionListener(e ->
        {
            Zadanie6.show();
        });
        zadanie7Button.addActionListener(e ->
        {
            Zadanie7.show();
        });
        zadanie8Button.addActionListener(e ->
        {
            Zadanie8.show();
        });
        zadanie9Button.addActionListener(e ->
        {
            Zadanie9.show();
        });
    }
}
