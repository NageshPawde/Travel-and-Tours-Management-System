
package travel.management.system;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class AddCustomer extends JFrame implements ActionListener {
    JComboBox c1;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JRadioButton r1,r2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    public AddCustomer(String username){
    
    setBounds(450,200,700,500);
    getContentPane().setBackground(Color.white);
    setLayout(null);
    
    l1 = new JLabel("Username :");
    l1.setBounds(10,15,100,20);
    l1.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l1);
    
    t1 = new JTextField();
    t1.setBounds(140,15,170,25);
    add(t1);
   
    l2 = new JLabel("ID :");
    l2.setBounds(10,60,100,20);
    l2.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l2);
    
     c1 = new JComboBox(new String[] { "Passport","Aadhar Card","Pan Card","Ration Card"});
     c1.setBounds(140,60,170,25);
     add(c1);
     
     l3 = new JLabel("Number :");
    l3.setBounds(10,105,100,20);
    l3.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l3);
    
    t3 = new JTextField();
    t3.setBounds(140,105,170,25);
    add(t3);
    
     l4 = new JLabel("Name :");
    l4.setBounds(10,150,100,20);
    l4.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l4);
    
    t4 = new JTextField();
    t4.setBounds(140,150,170,25);
    add(t4);
    
     l5 = new JLabel("Gender :");
    l5.setBounds(10,195,100,20);
    l5.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l5);
    
     r1 = new JRadioButton("Male");
    r1.setBounds(140,195,70,25);
    r1.setBackground(Color.white);
    add(r1);
    
    r2 = new JRadioButton("Female");
    r2.setBounds(240,195,70,25);
    r2.setBackground(Color.white);
    add(r2);
   
    l6 = new JLabel("Country :");
    l6.setBounds(10,240,100,20);
    l6.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l6); 
    
    t5 = new JTextField();
    t5.setBounds(140,240,170,25);
    add(t5);
    
    l7 = new JLabel("Address :");
    l7.setBounds(10,285,100,20);
    l7.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l7); 
    
    t7 = new JTextField();
    t7.setBounds(140,285,170,25);
    add(t7);
    
   
    l8 = new JLabel("Phone :");
    l8.setBounds(10,330,100,20);
    l8.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l8); 
    
    t8 = new JTextField();
    t8.setBounds(140,330,170,25);
    add(t8);
    
    l9 = new JLabel("Email : ");
    l9.setBounds(10,375,100,20);
    l9.setFont(new Font("Tahoma",Font.BOLD,15));
    add(l9); 
    
    t9 = new JTextField();
    t9.setBounds(140,375,170,25);
    add(t9);
    
    b1 = new JButton("Add");
    b1.setBounds(70,420,70,25);
    b1.setBackground(Color.GRAY);
    b1.setForeground(Color.white);
    b1.addActionListener(this);
    b1.setBorder(BorderFactory.createEmptyBorder());
    add(b1);
    
    b2 = new JButton("Back");
    b2.setBounds(170,420,70,25);
    b2.setBackground(Color.GRAY);
    b2.setForeground(Color.white);
    b2.addActionListener(this);
    b2.setBorder(BorderFactory.createEmptyBorder());
    add(b2);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/newcustomer.jpg"));
    Image i2 = i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l10 = new JLabel(i3);
    l10.setBounds(260,10,400,400);
    add(l10);
    
    
    try{
        Conn c = new Conn();
        ResultSet rs =c.s.executeQuery("select * from account where username='"+username+"'");
        while(rs.next()){
        t1.setText(rs.getString("username"));
        t4.setText(rs.getString("name"));
    }
    }
    catch(Exception e){
        
    }
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username = t1.getText();
            String id = (String) c1.getSelectedItem();
            String number = t3.getText();
            String name =  t4.getText();
            String radio = null;
            if(r1.isSelected()){
                radio = "Male";
            }
            else if(r2.isSelected()){
                 radio = "Female";
        }
            String country = t5.getText();
            String address = t7.getText();
            String phone = t8.getText();
            String email = t9.getText();
        
          String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
        try{
            Conn c = new Conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Details added successfully!!!");
        }
        catch(Exception e){
        }    
        }
        if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    

 public static void main(String[] args){
    AddCustomer obj = new AddCustomer("");
//   new AddCustomer("").setVisible(true);
 }    
}
