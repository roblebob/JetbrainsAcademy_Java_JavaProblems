import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfConries = scanner.nextInt();

        scanner.nextLine();

        String[] incomeStrings = scanner.nextLine().split(" ");
        String[] taxInPercentStrings = scanner.nextLine().split(" ");

        List<Double> taxes = new ArrayList<>();

        for (int i = 0; i < numberOfConries; i++) {
            taxes.add(
                    Integer.parseInt(incomeStrings[i]) *
                            Integer.parseInt(taxInPercentStrings[i]) / 100.0
            );
        }

        Double maxTax = Collections.max(taxes);

        List<Integer> countriesWithMaxTax = new ArrayList<>();

        for (int i = 0; i < numberOfConries; i++) {
            if (taxes.get(i).equals(maxTax)) {
                countriesWithMaxTax.add(i + 1);
            }
        }

        System.out.println(Arrays.toString(countriesWithMaxTax.toArray()).replaceAll("[\\[\\],]", ""));
    }
}