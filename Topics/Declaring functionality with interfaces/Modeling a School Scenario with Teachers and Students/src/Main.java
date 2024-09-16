import java.util.*;

public class Main {
    interface Person {
        // Write your code here
        String getName();
    }

    public static class Teacher implements Person {
        private final String name;
        private final String subject;

        // Constructor and other necessary methods go here
        Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
            System.out.println(getName());
        }

        @Override
        public String getName() {
            return String.format("Teacher: %s Subject: %s", name, subject);
        }
    }

    public static class Student implements Person {
        private final String name;
        private final String subject;

        // Constructor and other necessary methods go here
        Student(String name, String subject) {
            this.name = name;
            this.subject = subject;
            System.out.println(getName());
        }
        @Override
        public String getName() {
            return String.format("Student: %s Subject: %s", name, subject);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String[] inputs = sc.nextLine().split(":");
            if (inputs[0].startsWith("T")) {
                // handle teacher
                new Teacher(inputs[1], inputs[2]);
            }
            else if (inputs[0].startsWith("S")) {
                // handle student
                new Student(inputs[1], inputs[2]);
            }
        }

        sc.close();
    }
}