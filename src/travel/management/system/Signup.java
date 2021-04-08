package travel.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Signup extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
     Choice c1;
    public Signup(){
     getContentPane().setBackground(Color.white);
    setBounds(450,200,800,340);
    setLayout(null);
    setBackground(Color.white);
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(0,0,400,340);
    p1.setBackground(new Color(163,100,180));
    add(p1);
   
    JLabel l1 = new JLabel("Username");
    
    l1.setBounds(20,5,120,40);
    l1.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
    p1.add(l1);
    
    t1 = new JTextField();
    t1.setBounds(130, 10, 200, 25);//int x,int y,width,height
    t1.setBorder(BorderFactory.createEmptyBorder());
    
    p1.add(t1);
    
     JLabel l2 = new JLabel("Name");
    l2.setBounds(20,40,120,40);
    l2.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
    p1.add(l2);
    
    t2 = new JTextField();
    t2.setBounds(130, 50, 200, 25);
    t2.setBorder(BorderFactory.createEmptyBorder());
    p1.add(t2);
    
     JLabel l3 = new JLabel("Password");
    l3.setBounds(20,80,120,40);
    l3.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
    p1.add(l3);
    
    t3= new JTextField();
    t3.setBounds(130, 90, 200, 25);
    t3.setBorder(BorderFactory.createEmptyBorder());
    p1.add(t3);
    
    JLabel l4 = new JLabel("Security Question");
    l4.setBounds(20,120,120,40);
    l4.setFont(new Font("Tahoma",Font.BOLD,11));
    p1.add(l4);
    
    c1 = new Choice();
    c1.add("Your childhood Superhero");
    c1.add("Your Nickname");
    c1.add("Name of your City?");
    c1.add("Which is your favourite Color?");
    c1.add("Which is your favourite Movie");
       
         
    c1.setBounds(130,130,250,70);
    p1.add(c1);
    
     JLabel l5 = new JLabel("Answer");
    l5.setBounds(20,170,120,25);
    l5.setFont(new Font("SAN_SERIF",Font.PLAIN,17));
    p1.add(l5);
    
    t4 = new JTextField();
    t4.setBounds(130, 170, 200, 25);
    t4.setBorder(BorderFactory.createEmptyBorder());
    p1.add(t4);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
    JLabel l6 = new JLabel(i1);
    l6.setBounds(500, 80, 200, 200);
    l6.setBackground(Color.white);
    add(l6);
    
    b1 = new JButton("Create");
    b1.setBounds(70,221,80,30);
    b1.setBackground(Color.white);
    b1.setForeground(new Color(163,100,180));
    b1.setBorder(new LineBorder(Color.BLACK));
    b1.setFont(new Font("Tahoma",Font.BOLD,13));
    b1.addActionListener(this);
    p1.add(b1);
    
    b2 = new JButton("Back");
    b2.setBounds(210,220,80,30);
    b2.setFont(new Font("Tahoma",Font.BOLD,13));
    b2.setBackground(Color.white);
    b2.setForeground(new Color(163,100,180));
    b2.setBorder(new LineBorder(Color.BLACK));
    b2.addActionListener(this);
    p1.add(b2);
    
   
    
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username = t1.getText();
            String name = t2.getText();
            String password = t3.getText();
            String security = c1.getSelectedItem();
            String answer = t4.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
        try{
             Conn c = new Conn();
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Account Created Successfully");
             this.setVisible(false);
            new Login().setVisible(true);
        }
        catch(Exception e){}
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        new Login().setVisible(true);
        
    }
    }
    public static void main(String[] args){
        new Signup().setVisible(true);;
    }
    
}
