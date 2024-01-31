// Java code template starts here
import java.util.*;

// Define Animal class here
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Define Dog class here
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }
}

// Define Cat class here
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}




public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String species = sc.nextLine().trim();
        String name = sc.nextLine().trim();
        // In this section, you need to add code to receive input
        // and create the corresponding animal object
        Animal animal = new Animal();
        // Replace the placeholders with the appropriate calls
        if(species.equals("Dog")) {
            animal = new Dog();
        } else if(species.equals("Cat")) {
            animal = new Cat();
        } else {
            System.out.println("Animal type not recognized");
            return;
        }

        animal.makeSound();
        sc.close();
    }
} 

// Java code template ends here