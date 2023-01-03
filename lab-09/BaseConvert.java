import java.util.Scanner;

public class BaseConvert {
  public static void main(String[] args) {
    int baseEnteredByUser;                    // The new base the user enters.
    int base10NumberEnteredByUser;            // The number in base 10.
    int maxBase10Number;                      // The maximum number that will fit
                                              // in 4 digits in the new base.

    int powerOf0Column; // Digit in the ^0 column.
    int powerOf1Column; // Digit in the ^1 column.
    int powerOf2Column; // Digit in the ^2 column.
    int powerOf3Column; // Digit in the ^3 column.

    // The number in the new base entered by user
    String base10ConvertedToNewBase = "";

    Scanner input = new Scanner(System.in);

    // Read in the new base the user would like to convert to from base 10
    System.out.println("\nBase Conversion Program\n");
    System.out.print("Please enter a base (2 – 9): ");
    baseEnteredByUser = input.nextInt();

    /*
     * Compute the maximum base 10 number that will fit in 4 digits in the new base
     * entered by the user, and tell the user what range the number they want to
     * convert must be in.
     */
    System.out.print("Please enter a base 10 number in the range from 0 to " +
      maxBase10Number + " to convert: ");
    base10NumberEnteredByUser = input.nextInt();

    // Do the conversion

    // Print the result
  }
}
