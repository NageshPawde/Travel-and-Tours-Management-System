
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class Viewdetails extends JFrame implements ActionListener{
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
      JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;   
      JButton b1,b2;
public Viewdetails(String username){
    setBounds(450,200,700,500);
    getContentPane().setBackground(Color.white);
    
     setLayout(null);
        
        l12 = new JLabel("VIEW CUSTOMER DETAILS");
        l12.setBounds(50,15,600,30);
        l12.setFont(new Font("Railway",Font.BOLD,30));
        add(l12);
        
        l1 = new JLabel("Username :");
        l1.setBounds(10,70,100,20);
        l1.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l1);
    
        l13 = new JLabel();
        l13.setBounds(150,70,170,25);
        l13.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l13);
   
        l2 = new JLabel("ID :");
        l2.setBounds(10,110,170,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l2);
    
        l14 = new JLabel();   
        l14.setBounds(150,110,170,25);
         l14.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l14);
     
        l3 = new JLabel("Number :");
        l3.setBounds(10,150,100,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l3);

        l15 = new JLabel();
         l15.setFont(new Font("Tahoma",Font.BOLD,15));
        l15.setBounds(150,150,170,25);
        add(l15);

        l4 = new JLabel("Name :");
        l4.setBounds(10,190,100,20);
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l4);

        l16 = new JLabel();
        l16.setFont(new Font("Tahoma",Font.BOLD,15));
        l16.setBounds(150,190,170,25);
        add(l16);

        l5 = new JLabel("Gender :");
        l5.setBounds(10,230,100,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l5);
 
        l17 = new JLabel();
        l17.setFont(new Font("Tahoma",Font.BOLD,15));
        l17.setBounds(150,230,170,25);
        add(l17);
        
        l6 = new JLabel("Country :");
        l6.setBounds(10,270,100,20);
        l6.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l6); 
 
        l18 = new JLabel();
         l18.setFont(new Font("Tahoma",Font.BOLD,15));
        l18.setBounds(150,270,170,25);
        add(l18);

        l7 = new JLabel("Address :");
        l7.setBounds(10,310,100,20);
        l7.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l7); 

        l19 = new JLabel();
         l19.setFont(new Font("Tahoma",Font.BOLD,15));
        l19.setBounds(150,310,170,25);
        add(l19);


        l8 = new JLabel("Phone :");
        l8.setBounds(10,350,100,20);
        l8.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l8); 

        l20 = new JLabel();
         l20.setFont(new Font("Tahoma",Font.BOLD,15));
        l20.setBounds(150,350,170,25);
        add(l20);
 
        l9 = new JLabel("Email : ");
        l9.setBounds(10,390,100,20);
        l9.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l9); 

        l21 = new JLabel();
         l21.setFont(new Font("Tahoma",Font.BOLD,15));
        l21.setBounds(150,390,300,25);
        add(l21);



        b2 = new JButton("Back");
        b2.setBounds(170,420,70,25);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setBorder(BorderFactory.createEmptyBorder());
        add(b2);
        
           try{
             Conn c = new Conn();
            ResultSet rs = c.s.executeQuery( "select * from customer where username='"+username+"'");
            while(rs.next()){
                l13.setText(rs.getString("username"));
                l14.setText(rs.getString("name"));
                l15.setText(rs.getString("id"));
                l16.setText(rs.getString("number"));
                l17.setText(rs.getString("gender"));
                l18.setText(rs.getString("country"));
                l19.setText(rs.getString("address"));
                l20.setText(rs.getString("phone"));
                l21.setText(rs.getString("email"));
            }
        }
        catch(Exception e){
        }
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
       Image i2 = i1.getImage().getScaledInstance(410,200,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        l10 = new JLabel(i3);
       l10.setBounds(355,100,410,200);
       add(l10);

    
       setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource()==b2){
            this.setVisible(false);
        }
}    
public static void main(String[] args){
    new Viewdetails("").setVisible(true);
}
}
