package File_Io;

import java.io.File;
import java.io.IOException;

public class Make_Readonly {
	public static void main(String[] args) throws IOException
    {	
    	File myfile = new File("D://java//nmyfile.txt");
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
    }
}
