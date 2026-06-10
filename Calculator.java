import java.util.Scanner;
public class Calculator {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int ch;
         do {
             System.out.println("\n--- MENU ---");
             System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
             System.out.print("Enter choice: ");
             ch = sc.nextInt();
             if (ch == 5) break;
             System.out.print("Enter two numbers: ");
             double a = sc.nextDouble(), b = sc.nextDouble();
            switch (ch) {
                case 1: System.out.println("Result: " + (a + b)); break;
                case 2: System.out.println("Result: " + (a - b)); break;
                case 3: System.out.println("Result: " + (a * b)); break;
                case 4:
                    if (b == 0) System.out.println("Error: Division by zero");
                    else System.out.println("Result: " + (a / b));
                     break;
                default: System.out.println("Invalid choice!");
            }
        } while (ch != 5);
         System.out.println("Exiting...");
         sc.close();
    }
}

