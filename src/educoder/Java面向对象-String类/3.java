package step3;

public class HelloWorld {

	public void judge(String fileName,String email){
		//请在此添加实现代码
/********** Begin **********/

      
        System.out.println( !".java".equals(fileName.trim())&&fileName.trim().endsWith(".java")?"Java文件名正确":"Java文件名无效");
        // String t2 = scanner.nextLine();
        System.out.println(email.lastIndexOf('@') == email.indexOf('@')
                &&email.indexOf('@')!=-1&&
                email.indexOf('@') < email.indexOf(".")?"邮箱名正确":"邮箱名无效");


/********** End **********/
	}
	
	
}
