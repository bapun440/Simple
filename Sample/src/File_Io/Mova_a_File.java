package File_Io;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Mova_a_File {
	public static void main(String[] args) throws Throwable
    {
       /*File file = new File("D:\\java\\file\\MyOutputFileCo.txt");
         
        // renaming the file and moving it to a new location
        if(file.exists())
        {
            // if file copied successfully then delete the original file
            //Path p=Files.move("D:\\java\\file\\MyOutputFileCo", "D:\\java\\MyOutputFileCo");
        	FileSystem fileSys = FileSystems.getDefault();
            Path source =  fileSys.getPath("D:\\java\\file\\MyOutputFileCo.txt");
            Path newdir =  fileSys.getPath("D:\\java\\MyOutputFileCo.txt");
            
            Files.move(source, newdir, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }*/
 

		
		FileSystem fileSys = FileSystems.getDefault();
	    Path srcPath = fileSys.getPath("D:\\java\\file\\MyOutputFileCo.txt");
	    Path destPath = fileSys.getPath("D:\\java\\MyOutputFileCo.txt");
	    try {
	      //TO COPY file1.txt from source to destination folder
	      Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
	       
	      //TO MOVE file1.txt from source to destination folder
	      Files.move(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }
    }
}
