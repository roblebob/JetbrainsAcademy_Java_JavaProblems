import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instantiate a Car object here
        Car car = new Car();
        // and use the drive method
        car.drive(scanner.nextInt());
        // Use displaySpeed to print the current speed
        car.displaySpeed();
        scanner.close();
    }
}

class Car {
    private int speed;

    public Car() {
        // Initialize the speed field here
        speed = 0;
    }

    public void drive(int increase) {
        // Write a method that takes an integer as argument 
        // and adds it to the 'speed'.
        // Use a condition to check if the speed becomes greater than 200
        // if so, cap the speed at 200
        speed += increase;
        if (speed > 200) {
            speed = 200;
        }
    }

    public void displaySpeed() {
        // Write a method that prints the current speed
        System.out.println(speed);
    }
}