import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.HashMap.*;
public class hashmap {
    static void main() {
        HashMap<Integer,String>a=new HashMap<>();
        Scanner s=new Scanner(System.in);
        int idx=0;
        String colour;
        System.out.println("Enter the number of colours to be added: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            idx=s.nextInt();
            s.nextLine();
            colour=s.nextLine();
            a.put(idx,colour);
        }
        for(Map.Entry<Integer,String> entry: a.entrySet()){
            System.out.println("Index :"+entry.getKey()+" Colour :"+entry.getValue());
        }
        //Enter the key to be removed
        int key=s.nextInt();
        if(a.containsKey(key)){
            a.remove(key);
        }
        for(Map.Entry<Integer,String> entry: a.entrySet()){
            System.out.println("Index :"+entry.getKey()+" Colour :"+entry.getValue());
        }

    }
}
