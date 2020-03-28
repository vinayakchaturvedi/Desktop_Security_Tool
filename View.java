import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener, Runnable {
    JButton b1;
    JLabel l1;
    JPanel p1;
    Thread t1;
    int i = 0;

    public View() {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        b1 = new JButton("View");
        l1 = new JLabel();
        p1 = new JPanel();
        p1.add(b1);
        p1.add(l1);
        getContentPane().add(p1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        for (; ; ) {
            try {
                ImageIcon ico = new ImageIcon("c:\\pic\\" + i + ".jpg");
                l1.setIcon(ico);
                i++;
                t1.sleep(500);
            } catch (Exception ex) {

            }
        }

    }

    public static void main(String args[]) {
        new View();
    }

}
