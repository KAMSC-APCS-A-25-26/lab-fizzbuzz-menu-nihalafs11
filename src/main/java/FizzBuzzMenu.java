import java.util.Scanner;

public class FizzBuzzMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Display the menu
            System.out.println("\n=== FizzBuzz Menu ===");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // System.out.println("Fizz numbers (1–100):");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 24 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    //System.out.println("Buzz numbers (1–100):");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    //System.out.println("FizzBuzz numbers (1–100):");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}
