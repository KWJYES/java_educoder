package step1;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Consumer;
public class Task {
	/********* Begin *********/
	public void createFile(String filename){
			try {
				 new File("src/output",filename).createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	public void solution()            {
		createFile("test.txt");
		createFile("hello.txt");	
		/********* End *********/
	}
}
