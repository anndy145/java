import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int error = 0;
		double price = 0;
		int valid = 0;
		for (int i = index; i > 0; i--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ((a == 1 || a == 2) && b == 1) {
				price += 2.59 + 0.89;
				valid++;
			} else if ((a == 1 || a == 2) && b == 2) {
				price += 2.59;
				valid++;
			} else if ((a == 3 || a == 4) && b == 1) {
				price += 1.99 + 0.89;
				valid++;
			} else if ((a == 3 || a == 4) && b == 2) {
				price += 1.99;
				valid++;
			} else {
				error++;
			}
		}
		double total = price;
		if (valid > 9) {
			total = price * 0.9;
		}
		System.out.printf("Valid: %d%n", valid);
		System.out.printf("Invalid: %d%n", error);
		System.out.printf("Subtotal: $%.2f%n", price);
		System.out.printf("Total: $%.2f%n", total);
	}
}