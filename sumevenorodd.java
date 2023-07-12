import java.util.Scanner;
public class sumevenorodd {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = 0;
  int odd = 0;
  int even = 0;

  System.out.println("How many numbers will be entered?");
  n = input.nextInt();

  while (n < 0 || n > 100) {
    System.out.println("ERROR! Valid range 0-100. RE-Enter:");
    n = input.nextInt();
  }

  while(n >= 0) {
    System.out.println("Now enter " + n + " integers: ");
    int num = input.nextInt();

  while(num > 0) {
    for(int i = 0; i <= n; i++){
      if (i % 2 == 0) {
        even++;
      } 
      else {
        odd++;
      }
        System.out.println("You entered " + odd + " odd numbers and " + even + " even numbers.");
        }
      }
    }
  }
}