import java.sql.*;
import java.io.*;
public class program1{
    public static void main(String[] args){
        System.out.println("Employee Table controller ! ");
        ResultSet rs;
        ResultSetMetaData rm;
        String ename,job,salary,eno;
        int n,ch;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcprogramming","yadhu","password");
            Statement stmt=con.createStatement();
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            while(true){
                System.out.println("\n 1:Select \n2:Insert\n3:Update\n4:Delete\n5.exit\nEnter Choice: ");
                ch=Integer.parseInt(br.readLine());
                switch(ch){
                    case 1:
                        rs=stmt.executeQuery("Select * from employee");
                        rm=rs.getMetaData();
                        n=rm.getColumnCount();
                        while(rs.next()){
                            for(int i=1;i<n+1;i++){
                                System.out.print(rs.getString(i)+"\t\t");
                                }
                                System.out.println();
                            
                            
                        }
                        break;
                    case 2:
                        System.out.println("Enter Eno :");
                        eno=br.readLine();
                        System.out.println("Enter ename ;");
                        ename=br.readLine();
                        System.out.println("Enter Job :");
                        job=br.readLine();
                        System.out.println("Enter Salary : ");
                        salary=br.readLine();
                        stmt.execute("insert into employee values("+eno+",'"+ename+"','"+job+"',"+salary+")");
                        System.out.println("\nRecord inserted ");
                        break;
                    case 3:
                        System.out.println("Enter employee no to edit");
                        eno=br.readLine();
                        System.out.println("Enter Name");
                        ename=br.readLine();
                        System.out.println("Enter Job ");
                        job=br.readLine();
                        System.out.println("Enter Salary");
                        salary=br.readLine();
                        System.out.println("Updating...");
                        stmt.execute("update employee set ename='"+ename+"',job='"+job+"',salary='"+salary+"' where eno="+eno+" ");
                        break;
                    case 4:
                        System.out.println("Enter Eno to Delete");
                        eno=br.readLine();
                        stmt.execute("delete from employee where eno="+eno+"");
                        System.out.println("Record Deleted");
                        break;
                    case 5:
                        br.close();
                        con.close();
                        System.exit(0);
                }
            }
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}