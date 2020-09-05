package strings;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedString_true
{

        static long repeatedString(String s, long n)
        {
            Map<Long, Integer> myMap = new HashMap<>();
            long nCharString = s.length();
            long nStringsThatFit = n / nCharString;
            long excedentCharThatFit = n % nCharString;
            char aChar = 'a';
            long finalNumberOfA = 0;
            int aCounter = 0;

            for (int i = 0; i < nCharString; i++)
            {
                if (aChar == s.charAt(i))
                {
                    aCounter++;
                }
                myMap.put((long)i, aCounter);
                System.out.println("Until Char " + i + " we got " + myMap.get((long)i) + " As!");
            }
            finalNumberOfA = (nStringsThatFit) * myMap.get(nCharString - 1)
                    + (null != myMap.get(excedentCharThatFit) && excedentCharThatFit != 0
                    ? myMap.get(excedentCharThatFit)
                    : 0);
            return finalNumberOfA;
        }

//    static int repeatedString(String s, long n)
//    {
//        int count1 = s.length() - s.replaceAll("a", "").length();
//        long excedentCharThatFits = n % s.length();
//        int count2 = s.length() - s.split(String.valueOf(3)).length();
//        Map<Long, Integer> myMap = new HashMap<>();
//        long nCharString = s.length();
//        long nStringsThatFit = n / nCharString;
//        long excedentCharThatFit = n % nCharString;
//        char aChar = 'a';
//        long finalNumberOfA = 0;
//        int aCounter = 0;
//
//        for (int i = 0; i < nCharString; i++)
//        {
//            if (aChar == s.charAt(i))
//            {
//                aCounter++;
//            }
//            myMap.put((long) i, aCounter);
//            System.out.println("Until Char " + i + " we got " + myMap.get((long) i) + " As!");
//        }
//        finalNumberOfA = (nStringsThatFit) * myMap.get(nCharString - 1)
//                + (null != myMap.get(excedentCharThatFit) && excedentCharThatFit != 0
//                ? myMap.get(excedentCharThatFit)
//                : 0);
//        return finalNumberOfA;
//    }

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        long count = repeatedString(s, n);
        System.out.println(count);
    }
}
