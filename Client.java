import java.net.*;  
import java.io.*;  
class Client
{  
    public static void main(String args[])throws Exception
    {  
    Socket s=new Socket("localhost",3333);  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    System.out.println("Type stop To Close the communication ");
    String str="",str2="";  
    while(!str.equals("stop"))
    {  
	System.out.println("Enter the request");	
	str=br.readLine();  
	dout.writeUTF(str);  
	dout.flush();  
	str2=din.readUTF();  
	System.out.println("Sayeed says: "+str2);  
    }  
    dout.close();  
    s.close();  
    }
} 
