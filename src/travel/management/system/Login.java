
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    public Login(){
     
     getContentPane().setBackground(Color.white);//Contentpane that means it call whole container
     setLayout(null);

     setBounds(450,200,600,300);
    
     JPanel p1 = new JPanel();
     p1.setBounds(0,0,300,300);
     p1.setBackground(new Color(163,100,180));//only it call p1
     
     add(p1);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png"));
     JLabel l1 = new JLabel(i1);         //ClassLoader is used to load the class file into memory
     //l1.setBounds();
     p1.add(l1);
     
     JPanel p2 = new JPanel();
     p2.setLayout(null);
     p2.setBounds(300,30,350,230);
     add(p2);
     
     JLabel l3 = new JLabel("Username");
     l3.setBounds(60,20,100,25);
     l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
     p2.add(l3);
     
     t1 = new JTextField();
     t1.setBounds(60,50,200,25);
     t1.setBorder(BorderFactory.createEmptyBorder());
     p2.add(t1);
     
     JLabel l4 = new JLabel("Password");
     l4.setBounds(60, 85, 100, 20);
     l4.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
     p2.add(l4);
     
     t2 = new JPasswordField();
     t2.setBounds(60,113,200,25);
     t2.setBorder(BorderFactory.createEmptyBorder());
     p2.add(t2);
     
     b1 = new JButton("Login");
     b1.setBounds(60,150,74,30);
     b1.setBackground(new Color(163,100,180));
     b1.setBorder(new LineBorder(new Color(163,100,180)));
     b1.setForeground(Color.white);
     b1.addActionListener(this);
     p2.add(b1); 
     
     b2 = new JButton("Signup");
     b2.setBounds(160,150,74,30);
     b2.setBackground(Color.white);
     b2.setForeground(new Color(163,100,180));
     b2.addActionListener(this);
     b2.setBorder(new LineBorder(new Color(163,100,180)));
     
     p2.add(b2);
     
     b3 = new JButton("Forgot Password");
     b3.setBounds(85,190,130,30);
     b3.setBackground(Color.white);
     b3.setForeground(new Color(163,100,180));
     b3.setBorder(new LineBorder(new Color(163,100,180)));
     b3.addActionListener(this);
     p2.add(b3);
     
    }
     public void actionPerformed(ActionEvent ae){
         Conn c = new Conn();
         if(ae.getSource()== b1){
             String username = t1.getText();
             
             try{
            String sql = "Select * from account where username ='" + t1.getText()+"' AND password = '"+t2.getText()+"'";
            ResultSet rs = c.s.executeQuery(sql);
            if(rs.next()){
                this.setVisible(false);   //this keyword is reference variable that refers to current obj;
                new Loading(username).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid User");
            }
         }
             catch(Exception e){
                 
             }
         }
         else if(ae.getSource()==b2){
              this.setVisible(false);
              new Signup().setVisible(true);
             
         }
         else if(ae.getSource()==b3){
             this.setVisible(false);
             new ForgotPassword().setVisible(true);
         }
         
     }  
 
 public static void main(String[] args){
     new Login().setVisible(true);
 }
}

