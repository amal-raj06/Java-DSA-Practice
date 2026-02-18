import java.util.*;
import java.io.*;
public class prefixsum {
    public static void main(String args[]) {
        int[] a = {10, 12, 24, 36, 48, 59, 60, 71};
        int[] prefix = new int[8];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            prefix[i] = sum;
        }
        System.out.println("The prefix sum array is: ");
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
