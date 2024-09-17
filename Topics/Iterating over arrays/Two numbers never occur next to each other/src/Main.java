import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        scanner.nextLine();
        String string = scanner.nextLine();
        String[] numbersAsStrings = string.split(" ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean result = true;
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}