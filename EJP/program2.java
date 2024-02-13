import java.sql.*;
class JDBCPGM2
{
 public static void main(String args[])
 {
try
{
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student123","root","Gct@2018");
 Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
 ResultSet rs=stmt.executeQuery("select * from student");
 System.out.println("\n-->Print records from bottom to top");
 rs.afterLast();
 while(rs.previous())
 {
System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+"\t "+rs.getString(3));
 }
 System.out.println("\n-->To print 3rd record data using absolute(3):");
 rs.absolute(3);
 System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+"\t "+rs.getString(3));
 System.out.println("\n-->Print 2rd record data using relative(-1)");
 rs.relative(-1);
 System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+"\t "+rs.getString(3));
 System.out.println("\n-->Print the first record after moving to first position with first():");
 rs.first();
 System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+"\t "+rs.getString(3));
 System.out.println("\n-->Print the last record after moving to last record using last():");
 rs.last();
 System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+"\t "+rs.getString(3));
 System.out.println("\n-->Print records from top to bottom");
 rs.beforeFirst();
 while(rs.next())
 {
System.out.println(rs.getString(1)+"\t "+rs.getInt(2)+"\t "+rs.getString(3));
 }
 System.out.println("\n");
 rs.close();
 stmt.close();
 con.close();
}
catch(Exception e)
{
 System.out.println(e);
}
 }
}
