import java.rmi.*;
import java.rmi.server.*;
public interface ComplexI extends Remote
{
public Complex add(Complex c1,Complex c2)throws Exception;
public Complex subtract(Complex c1,Complex c2)throws Exception;
public Complex multiply(Complex c1,Complex c2)throws Exception;
}