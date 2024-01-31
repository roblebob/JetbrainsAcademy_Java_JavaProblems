import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    // Define your constant here
    static final double TAX_RATE = 0.1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take the floating point input from the user 
        double basePrice = scanner.nextDouble();
        // Apply the tax and calculate the final cost
        double finalPrice = basePrice * (1.0 + TAX_RATE);
        // Format the final result to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        // Insert code here to print the final cost
        System.out.println(df.format(finalPrice));
        scanner.close();
    }
}