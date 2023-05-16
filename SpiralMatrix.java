// Importing class
import static java.lang.System.*;

public class SpiralMatrix {
  // Declaring private variables
  String[][] spiral;
  private int s;

  // Empty constructor
  public SpiralMatrix() {
    
  }

  // Assigning value to private variable
  public SpiralMatrix(int size) {
    s = size;
  }

  // Setting size of matrix
  public void setSize(int size) {
    s = size;
    // Resetting matrix sizes
    spiral = new String[size][size];
  }

  // Makes the spiral in arrayList
  public void createSpiral() {
    // Declaring necessary variables
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;
    int a = 0;

    // Do while loop continuing until spiral is complete
    do {
      // For loop travelling down
      for (int i = a; i < s; i++) {
        // Changing values based on current arrayList
        if (spiral[i][a] == null) {
          spiral[i][a] = String.valueOf(n2);
          n2++;
        }
      }

      // Completing one side
      n1 = s - 1 - a;

      // For loops continue for each side
      // For loop travelling right
      for (int j = a; j < s; j++) {
        if (spiral[n1][j] == null) {
          spiral[n1][j] = String.valueOf(n2);
          n2++;
        }
      }

      // For loop travelling up
      for (int k = s - a - 1; k >= 0; k--) {
        if (spiral[k][n1] == null) {
          spiral[k][n1] = String.valueOf(n2);
          n2++;
        }
      }

      // For loop travelling left
      for (int l = s - a - 1; l >= 0; l--) {
        if (spiral[a][l] == null) {
          spiral[a][l] = String.valueOf(n2);
          n2++;
        }
      }

      // Adds to variables needed for spiral creation
      a++;
      n3++;

      // Continues until the middle number is reached (maximum)
    } while (n3 < s);
  }

  // toString method
  public String toString() {
    // Empty variable to input String data
    String output = "";
    // Nested for loop going through entire matrix
    for (int i = 0; i < s; i++) {
      for (int j = 0; j < s; j++) {
        // Checks for digits (length of number) for adding spaces
        if (spiral[i][j].length() == 1) {
          output = output + " " + spiral[i][j] + " ";
        } else
          output = output + spiral[i][j] + " ";
      }
      // Adds to output
      output = output + "\n";
    }
    return output;
  }
}
