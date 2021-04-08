
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Loading extends JFrame implements Runnable {
    JProgressBar p;
    Thread t;
    String username;
         public void run(){
        try{
            for(int i =1;i<=101;i++){
                int m = p.getMaximum();
                int n = p.getValue();
                if(n<m){
                    p.setValue(p.getValue()+1);
                }
                else{
                    i=101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);
                }
                Thread.sleep(50);
            }
        }
        catch(Exception e){
        }
        
    }
      public Loading(String user){
         username = user;
        t = new Thread(this);
        
        setBounds(500,200,500,300);
        
        setLayout(null);
         getContentPane().setBackground(Color.darkGray);
        JLabel l1 = new JLabel("T r a v e l  &  T o u r i s m ");
        l1.setFont(new Font("Railway",Font.BOLD,30));
        l1.setForeground(Color.cyan);
        l1.setBounds(55,10,500,30);
        add(l1);
        
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(90,90,300,20);
        add(p);
        
        JLabel l2 = new JLabel("Please Wait...");
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        l2.setForeground(Color.RED);
        l2.setBounds(190,110,200,25);
        add(l2);
        
        JLabel l3 = new JLabel("Welcome" +" "+ username);
        l3.setFont(new Font("Italic",Font.BOLD,25));
        l3.setForeground(Color.RED);
        l3.setBounds(140,160,250,35);
        add(l3);
        
        t.start();
        
    }
   
    public static void main(String[] args){
        new Loading("").setVisible(true);
    }
}
