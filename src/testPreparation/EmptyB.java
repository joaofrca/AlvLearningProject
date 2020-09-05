package testPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
*/
public class EmptyB
{
//https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string?page=2&tab=votes#tab-top
    public static List<String> giveNumbersList(String numberStr, List<String> numbersList)
    {
        int len = numberStr.length();
        if (len == 1)
        {
            numbersList.add(numberStr);
            return numbersList;
        }

        numbersList = giveNumbersList(numberStr.substring(0, len - 1), numbersList);
        int numbersListSize = numbersList.size();
        char middleChar = numberStr.charAt(len - 1);
        for (int i = 0; i < numbersListSize; i++)
        {
            String temp = numbersList.get(i);
            int tempLength = temp.length();
            for (int j = 0; j <= tempLength; j++)
            {
                numbersList.add(temp.substring(0, j) + middleChar + temp.substring(j, tempLength));
            }
        }

        while (true)
        {
            String temp = numbersList.get(0);
            if (temp.length() < len)
            {
                numbersList.remove(temp);
            }
            else
            {
                break;
            }
        }
        return numbersList;
    }

    public static void main(String[] args)
    {
//        String str = "abc";
//        ArrayList<String> list = new ArrayList<>();
//
//        list = giveNumbersList(str,list);
//        System.out.println("Total Permutations : "+list.size());
//        for(int i=0;i<list.size();i++)
//            System.out.println(list.get(i));

        String numberStr = String.valueOf(64653);
        List<String> numbersList = new ArrayList<>();

        int result = giveNumbersList(numberStr,numbersList).stream()
                .mapToInt(Integer::parseInt)
                .max().orElseThrow(NoSuchElementException::new);

        System.out.println(result);
    }
}




///ENTREGUE:
//// you can also use imports, for example:
//import java.util.*;
//
//// you can write to stdout for debugging purposes, e.g.
//// System.out.println("this is a debug message");
//
//class Solution {
//    public int solution(int N) {
//        // write your code in Java SE 8
//
//        String numberStr = String.valueOf(N);
//        List<String> numbersList = new ArrayList<>();
//
//        return giveNumbersList(numberStr,numbersList).stream()
//                .mapToInt(Integer::parseInt)
//                .max().orElseThrow(NoSuchElementException::new);
//    }
//
//
//    public static List<String> giveNumbersList(String numberStr, List<String> numbersList)
//    {
//        int len = numberStr.length();
//        if (len == 1)
//        {
//            numbersList.add(numberStr);
//            return numbersList;
//        }
//
//        numbersList = giveNumbersList(numberStr.substring(0, len - 1), numbersList);
//        int numbersListSize = numbersList.size();
//        char middleChar = numberStr.charAt(len - 1);
//        for (int i = 0; i < numbersListSize; i++)
//        {
//            String temp = numbersList.get(i);
//            int tempLength = temp.length();
//            for (int j = 0; j <= tempLength; j++)
//            {
//                numbersList.add(temp.substring(0, j) + middleChar + temp.substring(j, tempLength));
//            }
//        }
//
//        while (true)
//        {
//            String temp = numbersList.get(0);
//            if (temp.length() < len)
//            {
//                numbersList.remove(temp);
//            }
//            else
//            {
//                break;
//            }
//        }
//        return numbersList;
//    }
//}
