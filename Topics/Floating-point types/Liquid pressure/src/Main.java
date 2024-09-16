import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double g = 9.8;
        double pressure = density * g * height;
        System.out.println(pressure);
    }
}