import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        try {
            validAge(age);
            System.out.println("Age is valid ...");

        } catch(IllegalArgumentException e ) {
            System.out.println("error: " + e.getMessage());


        }

    }

    public static void validAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is lessthan userinput or naegative");
        }
        if (age > 100) {
            throw new IllegalArgumentException("Age is more");
        }
    }
}
