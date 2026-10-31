
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int width = input.nextInt();
        int length = input.nextInt();
        int height = input.nextInt();

        int volume = width * length * height;

        int surfaceArea = 2 * (width * length + width * height + length * height);

        System.out.println("Volume:" + volume);
        System.out.println("Surface Area: " + surfaceArea);

    }
}
