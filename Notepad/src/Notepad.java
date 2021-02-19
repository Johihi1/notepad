import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

public class Notepad {
    private JButton NewFile;

    public Notepad() {
        NewFile.addPropertyChangeListener(new PropertyChangeListener() {
        });
        NewFile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        private JTextArea TextArea;
        private JPanel panel1;
        private JButton NewFile;
        private JButton Save;
        private JScrollBar scrollBar1;
    }
}