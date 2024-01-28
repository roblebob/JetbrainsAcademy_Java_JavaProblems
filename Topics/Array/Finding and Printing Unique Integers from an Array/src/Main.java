import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner in = new Scanner(System.in);

        // Read the number of integers
        int n = in.nextInt();

        // Declare an array of integers
        Integer[] arr = new Integer[n];

        // Use a for loop to fill array with integers from input
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Insert the logic to extract unique elements from the array
        final List<Integer> list = Arrays.asList(arr);

        // Iterate over the unique elements
        Collection<Integer> mList = list
                .stream()
                .filter(i -> Collections.frequency(list, i) == 1)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        if (mList.isEmpty()) {
            System.out.println("No unique integers");
        } else {
            // ...  and print them one by one
            mList.forEach(System.out::println);
        }

        // Close the Scanner object
        in.close();
    }
}