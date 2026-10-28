
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double RATE = 75.84;

        int student1 = input.nextInt();
        int student2 = input.nextInt();

        double amount1 = student1 * RATE;
        double amount2 = student2 * RATE;

        System.out.printf("Student 1: $%.2f%n", amount1);
        System.out.printf("Student 2: $%.2f%n", amount2);

        input.close();
    }
}
