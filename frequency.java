import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.HashMap.*;
public class frequency {
    static void main() {
        int []a={1,2,2,3,2,1,2,3,1,2,3,2,1,3,2,1,2,3,5};
        HashMap<Integer,Integer>res=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!res.containsKey(a[i])){
                res.put(a[i],1);
            }
            else{
                int x=res.get(a[i]);
                x++;
                res.put(a[i],x);
            }
        }
        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            System.out.println("The character "+entry.getKey()+" occurs "+entry.getValue()+" times");
        }

    }
}
