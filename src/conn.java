package library.management.system;

import java.sql.*;
 
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///project7","root","");
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
