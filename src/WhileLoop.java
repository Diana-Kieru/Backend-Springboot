
public class WhileLoop {

  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      String message = (i % 2 == 0) ? "even" : "odd";
      System.out.println(i + " is " + message);
    }
  }
}
