package fibonacci;

import java.util.Scanner;

/**
 * This is Fibs main!
 */
public class FibonacciMain
{
    /**
     * To run from terminal:
     * $ javac MyPreparationClass.java
     * then you can run it from the command line like this:
     * $ java MyPreparationClass
     */
    public void main(String[] args)
    {
        System.out.println("I'm getting started.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        FibonacciImpl myFib = new FibonacciImpl();
        System.out.println(myFib.fibonacciForCycle(n));
    }

}