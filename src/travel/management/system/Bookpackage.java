
package travel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.LineBorder;
public class Bookpackage extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    Choice c1;
    JTextField t1;
    public Bookpackage(String username){
        setBounds(400,200,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        l1 = new JLabel("BOOK PACKAGE");
        l1.setBounds(70,0,300,35);
        l1.setForeground(new Color(148,0,211));
        l1.setFont(new Font("Railway",Font.BOLD,35));
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
        
         c1 = new Choice();
        c1.add("Gold Package");
        c1.add("Silver Package");
        c1.add("Bronze Package");
        c1.setBounds(220,80,250,25);
        add(c1);
        
         l5 = new JLabel("Total Person");
        l5.setBounds(10,120,200,20);
        l5.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l5);
         t1 = new JTextField("1");
        t1.setBounds(220,120,200,25);
        add(t1);
       
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
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dest8.jpg"));
       Image i2 = i1.getImage().getScaledInstance(440,360,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l15 = new JLabel(i3);
       l15.setBounds(450,10,440,360);
       add(l15);
       
        b1 = new JButton("Check Price");
        b1.setBounds(40,300,100,25);
        b1.setForeground(Color.white);
        b1.setBackground(Color.darkGray);
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(Color.darkGray));
        add(b1);
    
        b2 = new JButton("Book Package");
        b2.setBounds(180,300,100,25);
        b2.setForeground(Color.white);
        b2.setBackground(Color.darkGray);
        b2.setBorder(new LineBorder(Color.darkGray));
        b2.addActionListener(this);
       add(b2);
    
       b3 = new JButton("Back");
       b3.setBounds(320,300,80,25);
       b3.setForeground(Color.white);
       b3.setBackground(Color.darkGray);
       b3.setBorder(new LineBorder(Color.darkGray));
       b3.addActionListener(this);
       add(b3);
       
       try{
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from customer where username='"+username+"'");
           while(rs.next()){
               l3.setText(rs.getString("username"));
               l7.setText(rs.getString("id"));
               l9.setText(rs.getString("number"));
               l11.setText(rs.getString("phone"));
               
           }
       }
       catch(Exception e){
           
       }
        
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String p = c1.getSelectedItem();
            int cost =0;
            if(p.equals("Gold Package")){
                cost +=24000;
                
            }
            else if(p.equals("Silver Package")){
                cost +=12000;
        }
            else if(p.equals("Bronze Package")){
                cost +=6000;
            }
            int persons =Integer.parseInt(t1.getText());
            cost *=persons;
            l13.setText("Rs " + cost);
        }
        else if(ae.getSource()==b2){
            Conn c = new Conn();
            String username = l3.getText();
            String selectpackage = c1.getSelectedItem();
            String persons = t1.getText();
            String id = l7.getText();
            String number = l9.getText();
            String phone = l11.getText();
            String price = l13.getText(); 
            
            String q ="insert into bookpackage values('"+username+"','"+selectpackage+"','"+persons+"','"+id+"','"+number+"','"+phone+"','"+price+"')";
            try{
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Package Book Successfully!");
            }catch(Exception e){
                
            }
        } 
        else if(ae.getSource() ==b3){
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
    new Bookpackage("").setVisible(true);
}    
}
