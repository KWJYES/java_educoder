package step3;

import java.io.File;
import java.util.Arrays;

public class Task {
	
	/********** Begin **********/
   public void showDirStructure(File file)	{
        bianli(file,0);
    }
    public void bianli(File file,int leve){
        for (int i = 0; i < leve; i++) {
            System.out.print("  ");
        }
        if (file.isDirectory()){
            System.out.println("+--"+file.getName());
			File[] fs= file.listFiles();
			Arrays.sort(fs);
            for (File f : fs) {
                bianli(f,leve+1);
            }
        }else System.out.println("--"+file.getName());
    }
	/********** End **********/
}
