// Database Metadata


import java.sql.*;
public class program3{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprogramming","yadhu","password");
            DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("Driver Name:"+dbmd.getDriverName());
            System.out.println("Driver version:"+dbmd.getDriverVersion());
            System.out.println("Username :"+dbmd.getUserName());
            System.out.println("Product name:"+dbmd.getDatabaseProductName());
            System.out.println("Database Product version"+dbmd.getDatabaseProductVersion());
            con.close();
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}