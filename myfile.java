import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.ArrayList.*;
public class myfile {
    static void main() {
        Scanner s=new Scanner(System.in);
    ArrayList<String>names=new ArrayList<>();
    String input;
    //Adding names
    for(int i=0;i<8;i++){
        input=s.nextLine();
        names.add(input);
    }
    //Searching names
        //Enter the position of the name to be searched
        int pos=s.nextInt();
    System.out.println("The searched name is: "+names.get(pos));

    //Changing names
        //Enter the position for the name change
        //Enter the new name
        int pos1=s.nextInt();
        s.nextLine();
        String newname=s.nextLine();
        names.set(pos1,newname);
//Displaying names
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }

}
