import java.io.*;
import java.util.*;
import java.lang.*;
public class arrays {
    static void main() {
        int []arr={23,12,56,43,22,67,34};
        //Sum of the array
        int sum=0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array is: "+sum);
      /*
        //Reversing the array and displaying it
        int temp=0;
        for(int j=0;j<(arr.length)/2;j++){
            temp=arr[j];
            arr[j]=arr[arr.length-1-j];
            arr[arr.length-1-j]=temp;
        }*/
        //Printing after reversing the array
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
