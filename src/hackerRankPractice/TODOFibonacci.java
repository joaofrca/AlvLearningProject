package hackerRankPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is Fibs main!
 */
public class TODOFibonacci
{
    /**
     * To run from terminal:
     * $ javac MyPreparationClass.java
     * then you can run it from the command line like this:
     * $ java MyPreparationClass
     */
    public static void main(String[] args)
    {
        System.out.println("I'm getting started.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        printAllFibonacciNumbersUntilN(n);
    }

    public static void printAllFibonacciNumbersUntilN(int n)
    {
        int fibonacciNumber = 0;
        if (n <= 0)
        {
            System.out.println("Not possible to calculate.");
        }

        for (int j = 0; j < n; j++)
        {
            System.out.println(fibonacciNumber);
            fibonacciNumber++;
            if (j == 1) break;
        }

        if (n <= 2)
            return;

        int fibonacciMinusTwo = 0;
        int fibonacciMinusOne = 1;
        for (int i = 0; i < n - 2; i++)
        {
            fibonacciNumber = fibonacciMinusTwo + fibonacciMinusOne;
            fibonacciMinusTwo = fibonacciMinusOne;
            fibonacciMinusOne = fibonacciNumber;
            System.out.println(fibonacciNumber);
        }
    }

    public static void printAllFibonacciNumbersUntilN2(int n)
    {
        if (n <= 0)
            System.out.println("Not possible to calculate.");

        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);

        if (n > 2)
        {
            for (int i = 0; i < n - 2; i++)
            {
                fibonacciNumbers.add(fibonacciNumbers.get(fibonacciNumbers.size()-2)
                        +fibonacciNumbers.get(fibonacciNumbers.size()-1));
            }
        }

        fibonacciNumbers.forEach(fib->System.out.println(fib));
    }
}