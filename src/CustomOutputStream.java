import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;
/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class CustomOutputStream extends OutputStream {
    private JTextArea textArea;
    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }
    @Override
    public void write(int b) throws IOException {
        textArea.append(String.valueOf((char)b));
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}