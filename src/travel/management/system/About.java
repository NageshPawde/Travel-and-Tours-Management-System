
package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import javax.swing.*;
public class About extends JFrame {
    String s;
    public About(){
        setBounds(400,60,700,600);
        setLayout(null);
        getContentPane().setBackground(Color.gray);
        JLabel l1 =new JLabel("T r a v e l  &  T o u r i s m ");
        l1.setFont(new Font("Railway",Font.BOLD,40));
        l1.setForeground(Color.cyan);
        l1.setBounds(100,55,500,50);
        add(l1);
        
        JLabel l2 = new JLabel("About");
        l2.setFont(new Font("Railway",Font.BOLD,40));
        l2.setForeground(Color.red);
        l2.setBounds(280,5,500,50);
        add(l2);
        
      
         s = "The Main objective of this Travel & Tourism project is to make the travel easy and comfortable for the users "
                + "This project is to develop a system that automates the processes "
                + " and activities of a travel and the purpose is to design a "
                + " system using which one can perform all operations related to "
                + " traveling.\n\n"
                + " This Project will help in accessing the information related "
                + " to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this Project."
                + "user can book the packages and hotels by using this project\n\n"
                + "Advantages of Project:"
                + "\n* Gives accurate information"
                + "\n* Simplifies the manual work"
                + "\n* It minimizes the documentation related work"
                + "\n* Provides up to date information"
                + "\n* Friendly Environment by providing warning messages."
                + "\n* travelers details can be provided"
                + "\n* booking confirmation notification"
                ;
           TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
            t1.setBounds(40,150,600,300);
            t1.setBackground(Color.black);
            t1.setEditable(false);
            add(t1);
            
              Font f = new Font("RALEWAY", Font.PLAIN, 20);
                t1.setForeground(Color.white);
                t1.setFont(f);
    }
    public static void main(String[] args){
        new About().setVisible(true);
    }
}
