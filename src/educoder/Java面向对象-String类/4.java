package step4;

public class Reverse {
    public static StringBuffer start(String data) {
        StringBuffer ans = new StringBuffer();
        /********** Begin *********/
        String[] split = data.split("\\s+");
        for (String s : split) {
            StringBuffer stringBuffer = new StringBuffer(s);
            System.out.print(stringBuffer.reverse());
            System.out.print(" ");
        }
       
        /********** End *********/
        return ans;
    }
}
