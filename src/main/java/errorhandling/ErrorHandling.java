package errorhandling;

import java.util.Arrays;

/**
 * Created by svetlana on 25.09.16
 *
 * Error Handling
 Write a method “formatStrArrToIntArr”
 This method will get Array of 3 numbers in string format and will return an  Array of the 3 numbers in an Int format.
 Write a program that will use this method on various inputs:
 Array of 3 numbers as String
 Array of 3 non-numbers strings
 Null Array
 Array of 2 numbers as String

 Make sure to add treatment to each of the relevant exception by  printing appropriate and clear message to screen.
 */
public class ErrorHandling {
    public static void main(String[] args) {

        String[] arr = {"1", "2", "3"};
        String[] arrNonNumbers = {"a", "b", "c"};//NumberFormatException
        String[] arrNull = null;//NullPointerException
        String[] array = {"1", "2"};

        System.out.println(Arrays.toString(formatStrArrToIntArr(arrNonNumbers)));
    }

    public static int[] formatStrArrToIntArr(String[] arrNonNumbers) {
        int[] arrToInt = new int[3];

        try {
            arrToInt = new int[arrNonNumbers.length];

            for (int i = 0; i < arrNonNumbers.length; i++) {
                    arrToInt[i] = Integer.parseInt(arrNonNumbers[i]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Values are not numbers in the array");
        } catch (NullPointerException e) {
            System.out.println("Array is empty");
        }

        return arrToInt;
    }
}
