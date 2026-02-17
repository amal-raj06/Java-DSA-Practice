import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.HashMap.*;
public class duplicates {
    static void main() {
        int[]a={1,2,3,4,5,6,2,3,4};
        HashSet<Integer>res=new HashSet<>();
        int f=0;
        for(int i=0;i<a.length;i++){
            if(res.add(a[i])==false){
                System.out.println("The array contains duplicates of "+a[i]+" !!!");
                f=1;
                break;
            }
            else{
                res.add(a[i]);
            }
        }
        if(f==0){
            System.out.println("The array has all unique elements!!");
        }

    }

}
