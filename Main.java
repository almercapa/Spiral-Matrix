// Importing scanner
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // Declaring scanner, object, and variable
    Scanner input = new Scanner(System.in);
    SpiralMatrix m = new SpiralMatrix();
    int c;
    
    // Extra: User input
    System.out.println("How many matrixes would you like to create?");
    int n = input.nextInt();

    // For loop going until desired matrixes are created
    for (int i = 0; i < n; i++) {
      System.out.println("Enter your number: ");
      c = input.nextInt();
      // Using methods
      m.setSize(c);
      m.createSpiral();
      // Printing result
      System.out.println("\n" + m.toString());
    }
  }
}
