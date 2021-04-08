
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class Viewpackage extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    public Viewpackage(String username){
        setBounds(400,200,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        l1 = new JLabel("VIEW PACKAGE DETAILS");
        l1.setBounds(60,0,500,35);
        l1.setForeground(new Color(148,0,211));
        l1.setFont(new Font("Railway",Font.BOLD,25));
        add(l1);
        
        l2 = new JLabel("Username");
        l2.setBounds(10,50,200,20);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l2);
        
        l3 = new JLabel();
        l3.setBounds(220,50,200,20);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l3);

        l4 = new JLabel("Select Package");
        l4.setBounds(10,80,200,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l4);
        
        l14 = new JLabel();
        l14.setBounds(220,80,200,30);
        l14.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l14);
        
        
       
        
         l5 = new JLabel("Total Person");
        l5.setBounds(10,120,200,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l5);
        
        l15 = new JLabel("1");
        l15.setBounds(220,120,200,25);
        add(l15);
       
        l6 = new JLabel("ID");
        l6.setBounds(10,160,200,20);
        l6.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l6);
        l7 = new JLabel();
        l7.setBounds(220,160,200,20);
        l7.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l7); 
        
         l8 = new JLabel("Number");
        l8.setBounds(10,190,200,20);
        l8.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l8);  
        
        l9 = new JLabel();
        l9.setBounds(220,190,200,20);
        l9.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l9);
        
         l10 = new JLabel("Phone");
        l10.setBounds(10,220,200,20);
        l10.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l10);
        
         l11 = new JLabel();
        l11.setBounds(220,220,200,20);
        l11.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l11);
         l12 = new JLabel("Total price");
        l12.setBounds(10,250,200,20);
        l12.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l12);
        
         l13 = new JLabel();
        l13.setFont(new Font("Tahoma",Font.BOLD,15));
        l13.setForeground(Color.red);
        l13.setBounds(220,250,200,20);
        add(l13);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
       Image i2 = i1.getImage().getScaledInstance(440,360,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l16 = new JLabel(i3);
       l16.setBounds(450,10,440,360);
       add(l16);
       
    
        b1 = new JButton("Back");
        b1.setBounds(180,300,100,25);
        b1.setForeground(Color.white);
        b1.setBackground(Color.darkGray);
        b1.setBorder(new LineBorder(Color.darkGray));
        b1.addActionListener(this);
       add(b1);
    
 
       
       try{
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from bookpackage where username='"+username+"'");
           while(rs.next()){
               l3.setText(rs.getString("username"));
               l7.setText(rs.getString("id"));
               l9.setText(rs.getString("number"));
               l11.setText(rs.getString("phone"));
               l14.setText(rs.getString("selectpackage"));
               l15.setText(rs.getString("persons"));
               l13.setText(rs.getString("price"));
           }
       }
       catch(Exception e){
           
       }
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new Viewpackage("").setVisible(true);
    }
}
