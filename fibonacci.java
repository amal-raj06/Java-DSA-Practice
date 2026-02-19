import java.util.*;
import java.io.*;
public class fibonacci {
    static int getFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return getFib(n - 1) + getFib(n - 2);
    }

    public static void main(String[] args) {
        int count = 10; // How many numbers of the series you want

        System.out.println("Fibonacci Series up to " + count + " terms:");

        // We use a loop to call the recursive function for each position
        for (int i = 0; i < count; i++) {
            System.out.print(getFib(i) + " ");
        }
    }

}
