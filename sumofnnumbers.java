import java.util.*;
import java.io.*;
public class sumofnnumbers {
    static int sumofnnumber(int n){
        if(n==0){
            return 0;
        }
        return n+sumofnnumber(n-1);
    }
    static void printnumbers(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        printnumbers(n-1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=s.nextInt();
        int sum=sumofnnumber(n);
        printnumbers(n);
        System.out.printf("The sum of first %d number is %d\n",n,sum);
    }


}
