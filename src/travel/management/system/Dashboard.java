
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Dashboard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
    public Dashboard(String username){
       this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1950,55);
      //  p1.setBorder(new LineBorder(Color.white));
        add(p1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/travel1.png"));
        Image i5 = i4.getImage().getScaledInstance(80,55,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(0,0,80,55);
        p1.add(l2); 
        
        JLabel l3 = new JLabel("T r a v e l  &  T o u r i s m");
        l3.setBounds(95,7,400,40);
        l3.setForeground(Color.cyan);
        l3.setFont(new Font("Railway",Font.BOLD,30));
        p1.add(l3);
        
                
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,55,200,1000);
       // p2.setBorder(new LineBorder(Color.white));
        add(p2);
        
        b1 = new JButton("Add Personal Details");
        b1.setBounds(0,10,200,35);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Tahoma",Font.PLAIN,15));
        b1.addActionListener(this);
        b1.setBackground(new Color(0,0,102));
        
        p2.add(b1);
        
        b2 = new JButton("Update Personal Details");
        b2.setBounds(0,50,200,35);
        b2.setBackground(new Color(0,0,102));
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBounds(0,90,200,35);
        b3.setBackground(new Color(0,0,102));
        b3.setFont(new Font("Tahoma",Font.PLAIN,15));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        p2.add(b3);
         
        b4 = new JButton("Delete Personal Details");
        b4.setBounds(0,130,200,35);
        b4.setBackground(new Color(0,0,102));
        b4.setFont(new Font("Tahoma",Font.PLAIN,15));
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        p2.add(b4);
         
        b5 = new JButton("Check Package");
        b5.setBounds(0,170,200,35);
        b5.setBackground(new Color(0,0,102));
        b5.setFont(new Font("Tahoma",Font.PLAIN,15));
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        p2.add(b5);
         
        b6 = new JButton("Book Package");
        b6.setBounds(0,210,200,35);
        b6.setBackground(new Color(0,0,102));
        b6.setFont(new Font("Tahoma",Font.PLAIN,15));
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        p2.add(b6);
         
        b7 = new JButton("View Package");
        b7.setBounds(0,250,200,35);
        b7.setBackground(new Color(0,0,102));
        b7.setFont(new Font("Tahoma",Font.PLAIN,15));
        b7.addActionListener(this);
        b7.setForeground(Color.white);
        p2.add(b7);
         
        b8 = new JButton("View Hotels");
        b8.setBounds(0,290,200,35);
        b8.setBackground(new Color(0,0,102));
        b8.setFont(new Font("Tahoma",Font.PLAIN,15));
        b8.setForeground(Color.white);
        b8.addActionListener(this);
        p2.add(b8);
         
        b9 = new JButton("Book Hotel");
        b9.setBounds(0,290,200,35);
        b9.setBackground(new Color(0,0,102));
        b9.setFont(new Font("Tahoma",Font.PLAIN,15));
        b9.setForeground(Color.white);
        p2.add(b9);
         
        b10 = new JButton("Book Hotel");
        b10.setBounds(0,330,200,35);
        b10.setBackground(new Color(0,0,102));
        b10.setFont(new Font("Tahoma",Font.PLAIN,15));
        b10.setForeground(Color.white);
        b10.addActionListener(this);
        p2.add(b10);
         
        b11 = new JButton("View Booked Hotel");
        b11.setBounds(0,370,200,35);
        b11.setBackground(new Color(0,0,102));
        b11.setForeground(Color.white);
        b11.setFont(new Font("Tahoma",Font.PLAIN,15));
        b11.addActionListener(this);
        p2.add(b11);
         
        
        b12 = new JButton("Payment");
        b12.setBounds(0,410,200,35);
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.white);
        b12.setFont(new Font("Tahoma",Font.PLAIN,15));
        p2.add(b12);
        
        b13 = new JButton("Calculator");
        b13.setBounds(0,450,200,35);
        b13.setBackground(new Color(0,0,102));
        b13.setFont(new Font("Tahoma",Font.PLAIN,15));
        b13.addActionListener(this);
        b13.setForeground(Color.white);
        p2.add(b13);

        b14 = new JButton("Notepad");
        b14.setBounds(0,490,200,35);
        b14.setBackground(new Color(0,0,102));
        b14.setForeground(Color.white);
        b14.addActionListener(this);
        b14.setFont(new Font("Tahoma",Font.PLAIN,15));
        p2.add(b14);
        
        b15 = new JButton("About");
        b15.setBounds(0,530,200,35);
        b15.setBackground(new Color(0,0,102));
        b15.setForeground(Color.white);
        b15.setFont(new Font("Tahoma",Font.PLAIN,15));
        b15.addActionListener(this);
        p2.add(b15);
           
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/main3.jpg"));       
        Image i2 = i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1950,1000);
        add(l1);
        
        JLabel l4 = new JLabel("Travel and Tourism Management System");
        l4.setBounds(400,30,1000,200);
        l4.setForeground(Color.white);
        l4.setFont(new Font("Railway",Font.BOLD,50));
        l1.add(l4);
        
        
        
    }
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b13){
                try{
                    Runtime.getRuntime().exec("Calc.exe");
                    this.setVisible(true);
                }
                catch(Exception e){
                    
                }
            }
            else if(ae.getSource()==b14){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                    this.setVisible(true);
                }
                catch(Exception e){
                    
                }
            }
           else if(ae.getSource()==b1){
               new AddCustomer(username).setVisible(true);
           }
           else if(ae.getSource()==b2){
               new Updatedetails(username).setVisible(true);
           }
            else if(ae.getSource()==b5){
               new Checkpackage().setVisible(true);
           }
            else if(ae.getSource()==b6){
               new Bookpackage(username).setVisible(true);
        
            }
                 else if(ae.getSource()==b3){
               new Viewdetails(username).setVisible(true);
        
            }
                else if(ae.getSource()==b7){
                new Viewpackage(username).setVisible(true);
        
            } else if(ae.getSource()==b8){
               new CheckHotels().setVisible(true);
        
            }else if(ae.getSource()==b10){
               new Bookhotel(username).setVisible(true);
        
            }else if(ae.getSource()==b11){
               new Viewhotel(username).setVisible(true);
        
            }else if(ae.getSource()==b15){
               new About().setVisible(true);
        
            }else if(ae.getSource()==b4){
               new DeleteCustomer(username).setVisible(true);
        
            }
        }
        
   
    public static void main(String[] args){
        new Dashboard("").setVisible(true);
        
    }
}
