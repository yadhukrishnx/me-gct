import java.rmi.*;
import java.rmi.server.*;
public class Server
{
public static void main(String args[])
{
try{
ComplexC cs=new ComplexC();
Naming.rebind("rmi://127.0.0.1:1099/Comp",cs);
}catch(Exception e)
{
System.out.println(e);
}
}
}