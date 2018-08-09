package File_Io;

import java.io.File;
import java.text.SimpleDateFormat;

public class Last_Modfy {
	public static void main(String[] args)
    {	
        //Specify the file path and name
	File file = new File("D://Io//myfile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}
