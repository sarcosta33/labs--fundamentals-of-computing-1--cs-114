// *****************************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if each square is magic.
// *****************************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SquareTest {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner (new File("magicData"));

    int count = 1;             // Count which square we’re on
    int size = scan.nextInt(); // Size of next square

    // Expecting -1 at bottom of input file
    while (size != -1) {
      // Create a new Square of the given size

      // Call its read method to read the values of the square

      System.out.println("\n******** Square " + count + " ********");

      // Print the square

      // Print the sums of its rows

      // Print the sums of its columns

      // Print the sum of the main diagonal

      // Print the sum of the other diagonal

      // Determine and print whether it is a magic square

      // Get size of next square
      size = scan.nextInt();
    }
  }
}
