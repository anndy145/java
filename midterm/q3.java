import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        double price = 0;

        if (a == 1 || a == 2) {
            price += 2.59;
        }
        else if (a == 3 || a == 4) {
            price += 1.99;
        }

        if (b == 1) {
            price += 0.89;
            
        }

        System.out.printf("Total: $%.2f%n", price);
    }
}