package testPreparation;

import java.io.IOException;
import java.util.Scanner;

public class EmptyA
{

    static int doSomething(String s, long n)
    {

        return result;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);

        int[] intArray = {3, 4, 3, -1, 1000, 1, 2, 5, 7, 8, 9, 4, 44};

        String[] inzao = {
                "01234",         // "[1234]"
                "0001234a",      // "[1234a]"
                "101234",        // "[101234]"
                "000002829839",  // "[2829839]"
                "0",             // "[0]"
                "0000000",       // "[0]"
                "0000009",       // "[9]"
                "000000z",       // "[z]"
                "000000.z",      // "[.z]"
        };

        String s = in.next();
        long n = in.nextLong();
        int b = in.nextInt();

        int[] expenditure = new int[b];
        for (int i = 0; i < n; i++)
        {
            int temp = in.nextInt();
            expenditure[i] = temp;
            System.out.println(expenditure[i]);
        }

        //        long count = doSomething(s, n);
        System.out.println(" - - - RESULT IS: " + count + " - - -");
    }
}
