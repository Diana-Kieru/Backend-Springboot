import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int H = scanner.nextInt();

    // Check conditions
    if (H < A) {
      System.out.println("Deficiency");
    } else if (H > B) {
      System.out.println("Excess");
    } else {
      System.out.println("Normal");
    }
  }
}
