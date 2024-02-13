//Complex.java
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
public class Complex implements Serializable
{
int real,imag;
public Complex(int a,int b)
{
real=a;
imag=b;
}
}