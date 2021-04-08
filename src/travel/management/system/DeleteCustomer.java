package travel.management.system;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


       
public class DeleteCustomer extends JFrame implements ActionListener {
    Choice c1;
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton btnNewButton,btnNewButton2;
    String username;
    public DeleteCustomer(String user){
        this.username=user;
              setBounds(400, 160, 850, 550);
              JPanel contentPane = new JPanel();
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/delete.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,100,300,300);
                add(l1);
		
		JLabel lblName = new JLabel("DELETE CUSTOMER DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                JLabel lb3 = new JLabel("Username :");
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
                
                 l10= new JLabel();
                l10.setBounds(271,70,200,14);
                contentPane.add(l10);
                
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                 l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                JLabel lb2 = new JLabel("Number :");
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);
                
                 l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		 l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                 l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                 l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                 l7 = new JLabel();
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		JLabel lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                 l8 = new JLabel();
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		JLabel lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		 l9 = new JLabel();
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);
                
                btnNewButton = new JButton("Delete");
                btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.addActionListener(this);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
               
                btnNewButton2 = new JButton("Back");
                btnNewButton2.setBounds(280, 430, 120, 30);
                btnNewButton2.setBackground(Color.BLACK);
                btnNewButton2.addActionListener(this);
                btnNewButton2.setForeground(Color.WHITE);
		contentPane.add(btnNewButton2);
                
                 try{
             Conn c = new Conn();
            ResultSet rs = c.s.executeQuery( "select * from customer where username='"+username+"'");
            while(rs.next()){
                l10.setText(rs.getString("username"));
                l4.setText(rs.getString("name"));
                l2.setText(rs.getString("id"));
                l3.setText(rs.getString("number"));
                l5.setText(rs.getString("gender"));
                l6.setText(rs.getString("country"));
                l7.setText(rs.getString("address"));
                l8.setText(rs.getString("phone"));
                l9.setText(rs.getString("email"));
            }
        }
        catch(Exception e){
                }
        
    }
     public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
                  if(ae.getSource()==btnNewButton2){
            this.setVisible(false);
        }
            
        
          if(ae.getSource()== btnNewButton){
            
            
            
           try{
               c.s.executeUpdate("delete from customer where username='"+username+"'");
               JOptionPane.showMessageDialog(null, "Delete successfully");
               this.setVisible(false);
        }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

public static void main(String[] args) {
        new DeleteCustomer("").setVisible(true);
			
			}
}
	

