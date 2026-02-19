import java.util.*;
import java.io.*;
public class factorial {
    static int factorial(int num){
        if(num<=1){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number whose factorial is needed: ");
       int num=s.nextInt();
       int fact=factorial(num);
       System.out.printf("The factorial of %d is %d",num,fact);
    }
}
