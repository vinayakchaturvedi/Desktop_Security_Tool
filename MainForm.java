package DesktopScurityTool;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainForm extends JFrame implements ActionListener
{
    JMenuBar mb1;
    JMenu m1,m2;
    JMenuItem mm1,mm2,mm3,mm4;
public MainForm()
{
    setSize(500,500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mb1=new JMenuBar();
    m1=new JMenu("Desktop");
    m2=new JMenu("Help");
    mm1=new JMenuItem("Logger");
    mm2=new JMenuItem("View");
    mm3=new JMenuItem("Exit");
    mm4=new JMenuItem("Help");
    m1.add(mm1);
    m1.add(mm2);
    m1.add(mm3);
    m2.add(mm4);
    mb1.add(m1);
    mb1.add(m2);
    setJMenuBar(mb1);
    setSize(501,500);
     mm1.addActionListener(this);
     mm2.addActionListener(this);
     mm3.addActionListener(this);
     mm4.addActionListener(this);
     
}       
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==mm1)
    {
        Logger frm=new Logger();
        frm.setVisible(true);   // may or may not be used.
       
    }
    if(e.getSource()==mm2)
    {
        View frm=new View();
        frm.setVisible(true);  // may or may not be used.
        
    }
    if(e.getSource()==mm3)
    {
        System.exit(0);
    }
    if(e.getSource()==mm4)
    {
        
    }
    
}
public static void main(String args[])
{
    new MainForm();
}
}
