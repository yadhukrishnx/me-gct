import java.sql.*;
public class basicprogram{
	public static void main(String[] args){
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Loaded");
	}
	catch(ClassNotFoundException e){
	System.out.println("Exception"+e);
	}
	try{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprogramming","yadhu","password");
	Statement smt=con.createStatement();
	ResultSet rs=smt.executeQuery("select name from student");
	while(rs.next()){
	System.out.println(rs.getString("name"));
	}
	rs.close();
	smt.close();
	con.close();
	}
	catch(SQLException SE){
	System.out.println("SQL EXCEPTION");
	
	}
}
}
