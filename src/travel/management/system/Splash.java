
package travel.management.system;
import java.awt.Image;
import javax.swing.*;
public class Splash{
    public static void main(String[] args){
    SplashFrame f1 = new SplashFrame();
    f1.setVisible(true);
    int x=1;
    for(int i=1;i<=500;i+=5,x+=6){
    f1.setLocation(250,150);
    f1.setSize(x + i,i);
    try{
        Thread.sleep(10);
    }
    catch(Exception e){
        
    }
    }
    
}
}
class SplashFrame extends JFrame implements Runnable{
    
    public SplashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        Thread t1 = new Thread(this);
       t1.start();
       
      // setSize(1600,700);
      //setLocation(200,200) this both work in setBounds
      //setBounds(200,200,1200,500); //Location , Size
        setUndecorated(true);
        setVisible(true);
       
    }
     public void run(){
            try{
                Thread.sleep(6000);
                this.setVisible(false);
                new Login().setVisible(true);
            }
            catch(Exception e){
                
            }
        }
}