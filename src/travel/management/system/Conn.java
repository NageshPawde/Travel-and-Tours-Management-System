package travel.management.system;

import java.sql.*;

public class Conn {
    Connection c;//connection is interface from sql package and c is obj of connection interface
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travel","root","root");
            s = c.createStatement();
        }
        catch(Exception e){
            
        }
    }
 public static void main(String[] args){
     
 }   
}
