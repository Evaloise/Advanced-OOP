import java.util.Scanner;

public class FibonacciSum {

    public static long sumEvenFibonacci(int limit) {
        long sum = 0;
        int firstTerm = 1;
        int secondTerm = 2;

        while (secondTerm <= limit) {
            if (secondTerm % 2 == 0) {
                sum += secondTerm;
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return sum;
    }

    public static void main(String[] args) {
        int limit = 4000000;
        long sum = sumEvenFibonacci(limit);
        System.out.println("Sum of even-valued Fibonacci terms below " + limit + ": " + sum);
    }
}