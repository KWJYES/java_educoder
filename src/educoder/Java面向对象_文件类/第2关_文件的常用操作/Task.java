package educoder.Java面向对象_文件类.第2关_文件的常用操作;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;


public class Task {
	public static void dcFile() throws IOException {
		/********* Begin *********/
        File test2 = new File("src/test2");
        if (!test2.exists())
            test2.mkdir();
        File output = new File("src/output");
        new File(output, "test2.txt").delete();
        new File(test2, "helloworld.txt").createNewFile();
        new File(test2, "step2.txt").createNewFile();
        System.out.println("output目录结构为：");
        File[] files = output.listFiles();
        Arrays.sort(files);
        Arrays.stream(files)
                .map(File::getName)
                .forEach(System.out::println);
        System.out.println("test2目录结构为：");
        files = test2.listFiles();
        Arrays.sort(files);
        Arrays.stream(files)
                .map(File::getName)
                .forEach(System.out::println);
		/********* End *********/
	}
}
