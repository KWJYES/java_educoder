package educoder.Java面向对象_文件类.第1关_创建文件;


import java.io.File;
import java.io.IOException;

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
