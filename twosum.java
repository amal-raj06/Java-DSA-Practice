import java.util.*;
import java.io.*;
public class twosum {
    static void main() {
        int []a={2,7,11,15};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target=s.nextInt();
        int f=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("The target index are " + i + " and " + j + ".");
                    f = 1;
                    return;
                }
            }
        }
        System.out.println("There are no indexes for the target value!!!");
    }
}
