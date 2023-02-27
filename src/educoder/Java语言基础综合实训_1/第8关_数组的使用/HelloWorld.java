package educoder.Java语言基础综合实训_1.第8关_数组的使用;

/********* Begin *********/

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("N="+Arrays.toString(arr));

        /********* End *********/
    }
}
