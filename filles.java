package assignments;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filles {
	public static void main(String[] args) throws IOException {
		
//*******Write the file*************
		
		FileWriter fw = new FileWriter("F:\\time waste\\saikrishna.txt");
		fw.write("simplilearn \n");
		
//*******Append the file*************
		fw.append("Assignment");
		
		fw.close();
		
		System.out.println("Data entered in the file successfully \n");
		
		
//*******read the file*************
		
		FileReader fr = new FileReader("F:\\time waste\\saikrishna.txt");
		System.out.println("*******reading the file*************");
	        int i;
	        while ((i = fr.read()) != -1)
	            System.out.print((char)i);
	        
	        

	        
	       
	    }
	}


