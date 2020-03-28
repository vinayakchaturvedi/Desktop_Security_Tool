import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Logger extends JFrame implements ActionListener, Runnable {
    JButton b1, b2;
    JPanel p1;
    Thread t1;
    int i = 0;

    public Logger() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        b1 = new JButton("Start");
        b2 = new JButton("Stop");
        p1 = new JPanel();
        p1.add(b1);
        p1.add(b2);
        getContentPane().add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(200, 200);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t1 = new Thread(this);
            t1.start();
        } else {
            t1.stop();
            System.exit(0);
        }
    }

    public void run() {
        for (; ; ) {
            try {
                Robot r = new Robot();
                BufferedImage img = r.createScreenCapture(new java.awt.Rectangle(getToolkit().getScreenSize()));
                ImageIO.write(img, "jpg", new File("c:\\pic\\" + i + ".jpg"));
                i++;
                t1.sleep(500);

            } catch (Exception ex) {

            }
        }
    }

    public static void main(String args[]) {
        new Logger();
    }

}
