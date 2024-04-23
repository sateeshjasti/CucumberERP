package qedge.mar16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteText {

	public static void main(String[] args) throws Throwable{


		//write a script to write text into notepad

		//create new file
		
	
		
				File f = new File("D:/JAsti.txt");
				
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Iam learning java and selenium ");
				bw.newLine();
				bw.write("Iam learning selenium and pythons");
				bw.newLine();
				bw.write("Iam learning manual and automation testing");
			    bw.flush();
				bw.close();
				
				
	}

}
