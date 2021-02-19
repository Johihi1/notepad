/**
 *Notepad
 *
 * Created 2021-02-19
 * Author Johan Jokijärvi
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.beans.PropertyChangeListener;

public class Notepad {
    private JButton NewFile;
    private JButton Save;

    JFileChooser fc = new JFileChooser();
    int result = fc.showOpenDialog(null);
    String filename;
        if (result == JFileChooser.APPROVE_OPTION) {
        filename = fc.getSelectedFile().getAbsolutePath();
    } else {
        filename = "exempel.txt";
    }

    FileReader fr = null;
        try {
        fr = new FileReader(filename);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    BufferedReader inFile = new BufferedReader(fr);


    public Notepad() {
        NewFile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        Save.addMouseListener(new MouseAdapter() {
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