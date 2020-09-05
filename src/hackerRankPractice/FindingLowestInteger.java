package hackerRankPractice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * For a given array of integers, output the lowest positive integer outside of the array
 * INPUT EXAMPLE:
 * [2 3 3 45 1 6]
 * OUTPUT EXAMPLE:
 * 4
 */
public class FindingLowestInteger
{

    public static void main(String[] args) throws IOException
    {
        //        INPUT BEGIN
        //int[] intArray = {3, 4, 3, -1, 1000, 1, 2, 5, 7, 8, 9, 4, 44};
        int[] intArray = {1, 3, 6, 4, 1, 2};
        //        INPUT END

        getLowestInteger(intArray);

//        List<Integer> varianceArray = new ArrayList<>();
//        List<Integer> list = Arrays.stream(intArray)
//                .boxed()
//                .filter(c -> c.longValue() > 0)
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
//
//        //Print sorted positive non-repeated list
//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }
//
//        System.out.println("-----");
//
//        varianceArray.add(list.get(0));
//        for (int i = 0; i < list.size() - 1; i++)
//        {
//            varianceArray.add(list.get(i + 1) - list.get(i));
//            System.out.println(varianceArray.get(i));
//        }
//        System.out.println(varianceArray.get(list.size() - 1));
//
//        //RESULTS
//        if (varianceArray.isEmpty() || varianceArray.get(0) != 1)
//        {
//            System.out.println("FIRST");
//            System.out.println("Result is 1.");
//        }
//
//        List<Integer> positiveInBetween = varianceArray.stream()
//                .filter(c -> !c.equals(1))
//                .collect(Collectors.toList());
//        if (!positiveInBetween.isEmpty())
//        {
//            int duarte = varianceArray.indexOf(varianceArray.stream()
//                    .filter(i -> !i.equals(1))
//                    .findFirst()
//                    .get());
//
//            System.out.println("MIDDLE");
//            System.out.println("Result is " + (list.get(duarte - 1) + 1));
//        }
//        else
//        {
//            System.out.println("END");
//            System.out.println("Result is " + (list.get(list.size() - 1) + 1));
//        }

    }

    private static int getLowestInteger(int[] intArray)
    {
        List<Integer> intList = Arrays.stream(intArray)
                .boxed()
                .filter(i -> i > 0)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < intList.size(); i++)
        {
                System.out.println(intList.get(i));

        }

        if (intList.get(0) != 1)
        {
            System.out.println("Result is 1.");
            return 1;
        }
        else {
            for (int i = 1; i < intList.size(); i++)
            {
                if (intList.get(i)-intList.get(i-1) != 1){
                    System.out.println("Result is middle");
                    System.out.println(intList.get(i-1) + 1);
                    return intList.get(i-1) + 1;
                }
            }
        }
        System.out.println("Result is end");
        return intList.get(intList.size()-1) +1;
    }


}

