import java.util.Scanner;
public class DebugTwo2
{
   public static void main(String[] args)
   {
      int a, b;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer >> ");
      a = input.nextInt();
      System.out.print("Enter another integer >> ");
      b = input.nextInt();

      System.out.print("The sum is " + (a + b));
      System.out.print("The difference is " + (a - b));
      System.out.print("The product is " + (a * b));
   }
}
