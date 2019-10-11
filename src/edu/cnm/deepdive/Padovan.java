package edu.cnm.deepdive;

import java.util.Scanner;

/**
 * Implements a generator for the Padovan sequence. This generator takes the form of a static
 * method returning the first <em>n</em> terms of the sequence as a {@code long[]}.
 * <p>
 *   See <a href="../../../../..">README</a> for background information on the Padovan sequence.
 * </p>
 * @author Nicholas Bennett &amp; Deep Dive Coding Java + Android Bootcamp
 */
public class Padovan {

  private Padovan() {
    // NOTE: There is NO need to do anything with this constructor! The methods
    //       you will implement in this class are static; thus, there is no need
    //       to create instances of this class.
  }

  /**
   * Computes and returns the first {@code n} terms of the Padovan sequence.
   *
   * @param n desired length of the sequence.
   * @return first {@code n} terms.
   */
  public static long[] generate(int n) {


    class PadovanMain{

      public void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for Padovan sequence : ");

        int noOfTerms = scanner.nextInt();
        int nextNumber;

        System.out.print( firstNumber + " " + secondNumber + " " + thirdNumber);

        for(int i = 1; i <= noOfTerms - 3; i++) {

          nextNumber = secondNumber + firstNumber;
          System.out.print(" " + nextNumber);
          firstNumber = secondNumber;
          secondNumber = thirdNumber;
          thirdNumber = nextNumber;

        }


      }

    }

    // TODO Compute and return the first n terms, where p0 = 0, p1 = 1, p2 = 1, etc.
    return null;
  }

}
