/**
 *Notepad
 *
 * Created 2021-02-19
 * Author Johan Jokijärvi
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Notepad {
    public static void main(String[] args) {
    private JButton newfilebutton;
    private JButton savefilebutton;
    private JButton openFileButton;

    public Notepad() {
            newfilebutton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            savefilebutton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            openFileButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
        }
        private JTextArea TextArea;
        private JPanel panel1;
        private JScrollBar scrollBar1;
    }
}