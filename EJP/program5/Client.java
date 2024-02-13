import java.rmi.*;
import java.io.*;
public class Client
{
public static void main(String args[])
{
try
{
ComplexI com=(ComplexI)Naming.lookup("//127.0.0.1:1099/Comp");
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("\nEnter real and imaginary part of first number");
int r1=Integer.parseInt(br.readLine());
int i1=Integer.parseInt(br.readLine());
System.out.println("\nEnter real and imaginary part of second number");
int r2=Integer.parseInt(br.readLine());
int i2=Integer.parseInt(br.readLine());
Complex cs1=new Complex(r1,i1);
Complex cs2=new Complex(r2,i2);
Complex cs3=new Complex(0,0);
System.out.println("\nResult");
cs3=com.add(cs1,cs2);
System.out.println("\nsum= "+cs3.real+"+"+cs3.imag+"i");
cs3=com.subtract(cs1,cs2);
System.out.println("\ndifference= "+cs3.real+"+"+cs3.imag+"i");
cs3=com.multiply(cs1,cs2);
System.out.println("\nmul= "+cs3.real+"+"+cs3.imag+"i");
}
catch(Exception e)
{
System.out.println("\nException= "+e);
}
}
}