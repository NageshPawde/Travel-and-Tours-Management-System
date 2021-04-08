
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Checkpackage extends JFrame {
    public Checkpackage(){
       setBounds(450,100,900,550);
       JPanel p1 = createpackage();
       JPanel p2 = createpackage2();
       JPanel p3 = createpackage3();
       JTabbedPane pane = new JTabbedPane();
       pane.addTab("Package1",null,p1);
       
       pane.addTab("Package2",null,p2);
       
       pane.addTab("Package3",null,p3);
       add(pane);
       
       setVisible(true);
      
    }
    public JPanel createpackage(){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
       
        JLabel l1 = new JLabel("GOLD PACKAGE");
        l1.setBounds(40,30,300,35);
        l1.setFont(new Font("Railway",Font.BOLD,35)); 
        l1.setForeground(Color.DARK_GRAY);
        p1.add(l1);
        
        JLabel l2 = new JLabel("6 Days & 7 Nights");
        l2.setBounds(20,80,300,35);
        l2.setFont(new Font("Railway",Font.BOLD,25)); 
        l2.setForeground(Color.RED);
        p1.add(l2);
        
        JLabel l3 = new JLabel("Airport Assistance");
        l3.setBounds(20,130,300,35);
        l3.setFont(new Font("Railway",Font.BOLD,25)); 
        l3.setForeground(Color.BLACK);
        p1.add(l3);
       
        JLabel l4 = new JLabel("Half Day Tour");
        l4.setBounds(20,180,300,35);
        l4.setFont(new Font("Railway",Font.BOLD,25)); 
        l4.setForeground(Color.red);
        p1.add(l4);
        JLabel l5 = new JLabel("Daily Buffet");       
        l5.setBounds(20,230,300,35);
        l5.setFont(new Font("Railway",Font.BOLD,25)); 
        l5.setForeground(Color.black);
        p1.add(l5);
        
        JLabel l6 = new JLabel("Welcome Drinks ON Arrival");
        l6.setBounds(20,280,400,25);
        l6.setFont(new Font("Railway",Font.BOLD,25)); 
        l6.setForeground(Color.red);
        p1.add(l6);
        
        JLabel l7 = new JLabel("English Speaking Guide");
        l7.setBounds(20,320,400,35);
        l7.setFont(new Font("Railway",Font.BOLD,25)); 
        l7.setForeground(Color.black);
        p1.add(l7);
        
        JButton b1 = new JButton("Book Now");
        b1.setBounds(0,370,260,40);
        b1.setBackground(Color.white);
        b1.setFont(new Font("Railway",Font.BOLD,35)); 
        b1.setBorder(null);
        b1.setForeground(Color.green);
        p1.add(b1);
        
        JLabel l8 = new JLabel("WINTER SPECIAL");
        l8.setBounds(350,410,400,35);
        l8.setFont(new Font("Railway",Font.BOLD,25)); 
        l8.setForeground(Color.red);
        p1.add(l8);
        

        JLabel l9 = new JLabel("RS 24000/-");
        l9.setBounds(700,410,400,35);
        l9.setFont(new Font("Railway",Font.BOLD,25)); 
        l9.setForeground(Color.red);
        p1.add(l9);
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/package2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(370,20,500,300);
        p1.add(l10);
        
        return p1; 
       
    }
     public JPanel createpackage2(){
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
       
        JLabel l1 = new JLabel("SILVER PACKAGE");
        l1.setBounds(40,30,300,35);
        l1.setFont(new Font("Railway",Font.BOLD,32)); 
        l1.setForeground(Color.darkGray);
        p2.add(l1);
        
        JLabel l2 = new JLabel("5 Days & 6 Nights");
        l2.setBounds(20,80,300,35);
        l2.setFont(new Font("Railway",Font.BOLD,25)); 
        l2.setForeground(Color.RED);
        p2.add(l2);
        
        JLabel l3 = new JLabel("Airport Assistance");
        l3.setBounds(20,130,300,35);
        l3.setFont(new Font("Railway",Font.BOLD,25)); 
        l3.setForeground(Color.BLACK);
        p2.add(l3);
       
        JLabel l4 = new JLabel("Meet & Greet at Airport");
        l4.setBounds(20,180,300,35);
        l4.setFont(new Font("Railway",Font.BOLD,25)); 
        l4.setForeground(Color.red);
        p2.add(l4);
        
        JLabel l5 = new JLabel("Daily Buffet");       
        l5.setBounds(20,230,300,35);
        l5.setFont(new Font("Railway",Font.BOLD,25)); 
        l5.setForeground(Color.black);
        p2.add(l5);
        
        JLabel l6 = new JLabel("Welcome Drinks ON Arrival");
        l6.setBounds(20,280,400,25);
        l6.setFont(new Font("Railway",Font.BOLD,25)); 
        l6.setForeground(Color.red);
        p2.add(l6);
        
        JLabel l7 = new JLabel("English Speaking Guide");
        l7.setBounds(20,320,400,35);
        l7.setFont(new Font("Railway",Font.BOLD,25)); 
        l7.setForeground(Color.black);
        p2.add(l7);
        
        JButton b1 = new JButton("Book Now");
        b1.setBounds(0,370,260,40);
        b1.setBackground(Color.white);
        b1.setFont(new Font("Railway",Font.BOLD,35)); 
        b1.setBorder(null);
        b1.setForeground(Color.green);
        p2.add(b1);
        
        JLabel l8 = new JLabel("SUMMER SPECIAL");
        l8.setBounds(350,410,400,35);
        l8.setFont(new Font("Railway",Font.BOLD,25)); 
        l8.setForeground(Color.red);
        p2.add(l8);
        

        JLabel l9 = new JLabel("RS 12000/-");
        l9.setBounds(700,410,400,35);
        l9.setFont(new Font("Railway",Font.BOLD,25)); 
        l9.setForeground(Color.red);
        p2.add(l9);
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(370,20,500,300);
        p2.add(l10);
        
        return p2; 
     }
      public JPanel createpackage3(){
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.WHITE);
       
        JLabel l1 = new JLabel("BRONZE PACKAGE");
        l1.setBounds(40,30,300,35);
        l1.setFont(new Font("Railway",Font.BOLD,31)); 
        l1.setForeground(Color.darkGray);
        p3.add(l1);
        
        JLabel l2 = new JLabel("4 Days & 5 Nights");
        l2.setBounds(20,80,300,35);
        l2.setFont(new Font("Railway",Font.BOLD,25)); 
        l2.setForeground(Color.RED);
        p3.add(l2);
        
        JLabel l3 = new JLabel("Airport Assistance");
        l3.setBounds(20,130,300,35);
        l3.setFont(new Font("Railway",Font.BOLD,25)); 
        l3.setForeground(Color.BLACK);
        p3.add(l3);
       
        JLabel l4 = new JLabel("Meet & Greet at Airport");
        l4.setBounds(20,180,300,35);
        l4.setFont(new Font("Railway",Font.BOLD,25)); 
        l4.setForeground(Color.red);
        p3.add(l4);
        
        JLabel l5 = new JLabel("Daily Buffet");       
        l5.setBounds(20,230,300,35);
        l5.setFont(new Font("Railway",Font.BOLD,25)); 
        l5.setForeground(Color.black);
        p3.add(l5);
        
        JLabel l6 = new JLabel("Welcome Drinks ON Arrival");
        l6.setBounds(20,280,400,25);
        l6.setFont(new Font("Railway",Font.BOLD,25)); 
        l6.setForeground(Color.red);
        p3.add(l6);
        
        JLabel l7 = new JLabel("English Speaking Guide");
        l7.setBounds(20,320,400,35);
        l7.setFont(new Font("Railway",Font.BOLD,25)); 
        l7.setForeground(Color.black);
        p3.add(l7);
        
        JButton b1 = new JButton("Book Now");
        b1.setBounds(0,370,260,40);
        b1.setBackground(Color.white);
        b1.setFont(new Font("Railway",Font.BOLD,35)); 
        b1.setBorder(null);
        b1.setForeground(Color.green);
        p3.add(b1);
        
        JLabel l8 = new JLabel("WINTER SPECIAL");
        l8.setBounds(350,410,400,35);
        l8.setFont(new Font("Railway",Font.BOLD,25)); 
        l8.setForeground(Color.red);
        p3.add(l8);
        

        JLabel l9 = new JLabel("RS 6000/-");
        l9.setBounds(700,410,400,35);
        l9.setFont(new Font("Railway",Font.BOLD,25)); 
        l9.setForeground(Color.red);
        p3.add(l9);
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/package3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(370,20,500,300);
        p3.add(l10);
        
        return p3; 
     }
    public static void main(String[] args){
       new Checkpackage().setVisible(true);
         
    }
}
