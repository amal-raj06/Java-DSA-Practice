import java.util.*;

public class twosumhashmap {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = s.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                System.out.println("The two indices are: "
                        + map.get(needed) + " and " + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("There are no indices for the target value!!!");
    }
}
