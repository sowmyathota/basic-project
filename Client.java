import java.io.*;
import java.net.*;
public class Client{
public static void main(String args[])
{
try{
Socket s=new Socket("localhost",6555);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("HELLO SERVER");//wriring into the server
dout.flush();//flushing 
dout.close() ;
s.close();//closing socket
}
catch(Exception e)
{
System.out.println(e);
}

}

}
