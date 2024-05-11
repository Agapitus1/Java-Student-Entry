import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

public class StudenEntry extends JFrame
{
    private Student student = new Student();
    private MyPanel panel = new MyPanel();
    public StudenEntry()
    {
        super("Student Data Entry");
        setup();
        build();
        setVisible(true);
    }

    public void setup()
    {
        setSize(300,200);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void build()
    {
        add(panel);
    }
    private class MyPanel extends JPanel implements MyObserver
    {
        private JTextField idfield = new JTextField(5);
        private JTextField namefield = new JTextField(20);
        private JLabel idlabel = new JLabel("Id: ");
        private JLabel namelabel = new JLabel("Name: ");
        private JLabel setlabel = new JLabel();
        private JButton setbutton = new JButton("Set");
        public MyPanel()
        {
            student.attach(this);
            setup();
            build();
        }

        private void setup()
        {
            setbutton.addActionListener(new setbuttonListener());
        }

        private void build()
        {
            add(idlabel);
            add(idfield);
            add(namelabel);
            add(namefield);
            add(setbutton);
            add(setlabel);
        }

        public void update()
        {
            setlabel.setText("" + student.toString());
        }
        private class setbuttonListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                student.set(Integer.parseInt(idfield.getText()), namefield.getText());
            }
        }
    }
}
