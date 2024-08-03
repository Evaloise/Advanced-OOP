import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // a) Get 15 integers from the user and store them in the array
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // b) Print the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // c) Check if a number is present in the array
        System.out.print("Enter a number to search for: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // d) Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // e) Create a new array with elements in reverse order
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        // f) Calculate the sum and product of array elements
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}