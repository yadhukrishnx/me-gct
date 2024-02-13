//resultset Metadata
import java.sql.*;
public class program4{
    public static void main(String[] args){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprogramming","yadhu","password");
        PreparedStatement ps=con.prepareStatement("select * from employee");
        ResultSet rs=ps.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        System.out.println("Total columns :"+rsmd.getColumnCount());
        
        System.out.println("Column name of 1 :"+rsmd.getColumnName(1));
        System.out.println("Column Type name :" +rsmd.getColumnTypeName(1));
        con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}