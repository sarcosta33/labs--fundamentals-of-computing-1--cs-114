// *****************************************************************************
// Square.java
//
// Define a Square class with methods to create and read in info for a square
// matrix and to compute the sum of a row, a column, either diagonal, and
// whether it is magic.
// *****************************************************************************

import java.util.Scanner;

public class Square {
  int[][] square;

  // ---------------------------------------------------------------------------
  // Create new square of given size
  // ---------------------------------------------------------------------------
  public Square(int size) {
  }

  // ---------------------------------------------------------------------------
  // Return the sum of the values in the given row
  // ---------------------------------------------------------------------------
  public int sumRow(int row) {
  }

  // ---------------------------------------------------------------------------
  // Return the sum of the values in the given column
  // ---------------------------------------------------------------------------
  public int sumCol(int col) {
  }

  // ---------------------------------------------------------------------------
  // Return the sum of the values in the main diagonal
  // ---------------------------------------------------------------------------
  public int sumMainDiag() {
  }

  // ---------------------------------------------------------------------------
  // Return the sum of the values in the other ("reverse") diagonal
  // ---------------------------------------------------------------------------
  public int sumOtherDiag() {
  }

  // ---------------------------------------------------------------------------
  // Return true if the square is magic (all rows, cols, and diagonals have same
  // sum); false otherwise
  // ---------------------------------------------------------------------------
  public boolean magic() {
  }

  // ---------------------------------------------------------------------------
  // Read info into the square from the standard input.
  // ---------------------------------------------------------------------------
  public void readSquare(Scanner scan) {
    for (int row = 0; row < square.length; row++) {
      for (int col = 0; col < square.length; col++) {
        square[row][col] = scan.nextInt();
      }
    }
  }

  // ---------------------------------------------------------------------------
  // Print the contents of the square, neatly formatted
  // ---------------------------------------------------------------------------
  public void printSquare() {
  }
}
