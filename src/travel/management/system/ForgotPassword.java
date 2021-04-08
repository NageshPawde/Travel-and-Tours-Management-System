
package travel.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4,t5,t6;
    public ForgotPassword(){
        setBounds(450,200,700,310);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
       
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,410,310);
        add(p1);
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
        JLabel l6 = new JLabel(i1);
        l6.setBounds(390,0,310,250);
        add(l6);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(20,5,100,20);
        l1.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(130,5,170,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2 = new JLabel("Name");
         l2.setBounds(20,40,120,40);
         l2.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        p1.add(l2);
    
        t2 = new JTextField();
        t2.setBounds(130, 50, 170, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
    
       JLabel l3 = new JLabel("Password");
       l3.setBounds(20,80,120,40);
       l3.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
       
       p1.add(l3);
    
       t3= new JTextField();
       t3.setBounds(130, 90, 170, 25);
       t3.setBorder(BorderFactory.createEmptyBorder());
       t3.setForeground(Color.green);
       p1.add(t3);
    
       JLabel l4 = new JLabel("Security Question");
       l4.setBounds(20,120,120,40);
       l4.setFont(new Font("Tahoma",Font.BOLD,11));
       p1.add(l4);
    
       t4 = new JTextField();
       t4.setBounds(130, 130, 250, 25);
       t4.setBorder(BorderFactory.createEmptyBorder());
       p1.add(t4);
    
    JLabel l5 = new JLabel("Answer");
    l5.setBounds(20,170,120,25);
    l5.setFont(new Font("SAN_SERIF",Font.PLAIN,17));
    p1.add(l5);
    
    t5 = new JTextField();
    t5.setBounds(130, 170, 170, 25);
    t5.setBorder(BorderFactory.createEmptyBorder());
    p1.add(t5);
    
    b1 = new JButton("Back");
    b1.setBounds(90,220,80,25);
    b1.setForeground(Color.white);
    b1.setBackground(Color.darkGray);
    b1.addActionListener(this);
    b1.setBorder(new LineBorder(Color.darkGray));
    p1.add(b1);
    
    b2 = new JButton("Search");
    b2.setBounds(310,7, 80,25);
    b2.setForeground(Color.white);
    b2.setBackground(Color.darkGray);
    b2.setBorder(new LineBorder(Color.darkGray));
    b2.addActionListener(this);
    p1.add(b2);
    
    b3 = new JButton("Retrieve");
    b3.setBounds(310,170,80,25);
    b3.setForeground(Color.white);
    b3.setBackground(Color.darkGray);
    b3.setBorder(new LineBorder(Color.darkGray));
    b3.addActionListener(this);
    p1.add(b3);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource()==b1){
            this.setVisible(false);
           new Login().setVisible(true);
        }
        else if (ae.getSource()==b2){
            try{
            String sql ="Select * from account where username ='" + t1.getText()+"'";
            ResultSet rs =c.s.executeQuery(sql);
            while(rs.next()){
                t2.setText(rs.getString("name"));
                t4.setText(rs.getString("security"));
              
            }
            }
            catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b3){
            try{
                String sql = "Select * from account where answer ='"+ t5.getText()+"' AND username = '" +t1.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                while(rs.next()){
                t3.setText(rs.getString("password"));
            }
                
            }
            catch(Exception e){
                
            }
        }
    }
    
    public static void main(String[] args){
        new ForgotPassword().setVisible(true);
    }
}
