import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class ComplexC extends UnicastRemoteObject implements ComplexI
{
Complex cs;
public ComplexC()throws RemoteException,IOException
{
cs=new Complex(0,0);
}
public Complex add(Complex c1,Complex c2)throws Exception
{
cs.real=c1.real+c2.real;
cs.imag=c1.imag+c2.imag;
return cs;
}
public Complex subtract(Complex c1,Complex c2)throws Exception
{
cs.real=c1.real-c2.real;
cs.imag=c1.imag-c2.imag;
return cs;
}
public Complex multiply(Complex c1,Complex c2)throws Exception
{
cs.real = c1.real * c2.real - c1.imag * c2.imag;
cs.imag = c1.real * c2.imag + c1.imag * c2.real;
return cs;
}
}