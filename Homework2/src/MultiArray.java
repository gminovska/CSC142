
import java.util.Scanner;

/**
 * Created by Ekogoca on 01/28/2017.
 * This is an exercise on using control loops and navigating arrays
 * Multi-dimensional arrays require nested loops
 * The outer loop is for the rows
 * The inner is for the columns

 */

public class MultiArray {
   public static void main(String[] args) {

   //declare and initialize and array of size 10 by 10
    int[][] myArray = new int[10][10];

    // populate myArray with ones
       SetInitialValue(myArray, 1);
       PrintArray(myArray);

       System.out.println("PatternRow function in action");

       PatternRow(myArray, 1, 0);
       PrintArray(myArray);

       System.out.println("PatternCheckered function in action");

       PatternCheckered(myArray, 1, 0);
       PrintArray(myArray);

       System.out.println("UserChoice function in action");

       UserChoice(myArray);
       PrintArray(myArray);

       System.out.println("SumArray function in action");
       SumArray(myArray);
    }

    /**
     * @param myArray is a 2-d array
     * Outputs the contents of a 2-D array
     */
    private static void PrintArray(int[][] myArray) {

        for( int i = 0; i < myArray.length; i++ ){
            for (int j = 0; j < myArray[i].length;j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param myArray is a 2-d array
     * @param number is the number all the fields in the array will be set to
     * Populates all fields in a 2-D array with a number
     */
    private static void SetInitialValue(int[][] myArray, int number) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = number;
            }
        }
    }

    /**
     * @param myArray is a 2-D array
     * @param num1 is the number in the even columns
     * @param num2 is the number in the odd columns
     * Populates a two dimensional array
     * with 2 numbers
     * alternating by the row
     * Ex. 11111
     *     00000
     *     11111
     */
    private static void PatternRow(int[][] myArray, int num1, int num2) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i % 2 == 0) {
                    myArray[i][j] = num1;
                }
                else {
                    myArray[i][j] = num2;
                }
            }
        }
    }

    /**
     * Method creates a checkered pattern of 2 numbers
     * in a 2-d array
     * @param myArray is a 2-d array
     * @param num1 is the number the pattern starts with
     * @param num2 is the alternating number
     */
    private static void PatternCheckered(int[][] myArray, int num1, int num2) {

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        myArray[i][j] = num1;
                    }
                    else {
                        myArray[i][j] = num2;
                    }
                }
                else if (i % 2 == 1) {
                    if(j % 2 == 1) {
                        myArray[i][j] = num1;
                    }
                    else {
                        myArray[i][j] = num2;
                    }
                }
            }
        }
    }

    /**
     * @param myArray is a 2-d array
     *  This method takes in 3 numbers from the user
     *  and populates the array with them in sequence
     * Ex. 1751751
     *     7517517
     *     5175175
     */
    private static void UserChoice(int[][] myArray) {

//        collect the 3 numbers from the user and store them in variables
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number 1:");
            int num1 = scanner.nextInt();

            System.out.print("Enter number 2:");
            int num2 = scanner.nextInt();

            System.out.print("Enter number 3:");
            int num3 = scanner.nextInt();


//loop and populate the array
        for (int i = 0; i < myArray.length; i += 3) {
            for (int j = 0; j < myArray[i].length; j += 3) {
                if(i % 3 == 0 && j % 3 == 0){
                    myArray[i][j] = num1;
                    if(i+1 < myArray.length) {
                        myArray[i+1][j] = num2;
                        myArray[i+2][j] = num3;
                    }

                    if(j+1 < myArray.length) {
                        myArray[i][j+1] = num2;
                        myArray[i][j+2] = num3;
                    }
                    if(i+1 < myArray.length && j+1 <myArray.length){
                        myArray[i+1][j+2] =num1;
                        myArray[i+1][j+1] = num3;
                        myArray[i+2][j+1] = num1;
                        myArray[i+2][j+2] = num2;
                    }
                }
            }
        }

    }

    /**
     * @param myArray is a 2-d array
     *  The method sums up the rows of the array, prints it next to the array
     *               and calculates the sum of all the values in the array
     */
    private static void SumArray(int[][] myArray) {

        int grandTotal = 0;
        for (int i = 0; i < myArray.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < myArray[i].length; j++) {
                rowSum += myArray[i][j];
                System.out.print(myArray[i][j] + " ");

            }
            grandTotal +=rowSum;
            System.out.println(" Sum: " + rowSum);

        }
        System.out.println(" Grand Total: " + grandTotal);
    }
}

