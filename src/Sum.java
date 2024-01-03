import java.util.Scanner;

class Sum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int a = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int b = scanner.nextInt();

    int n = b - a + 1;
    int sum = (n * (a + b)) / 2;

    System.out.println("The sum is " + sum);
  }
}



