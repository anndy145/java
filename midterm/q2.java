import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Blastoff!");

        input.close();
    }
}
