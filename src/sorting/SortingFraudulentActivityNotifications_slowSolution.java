package sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingFraudulentActivityNotifications_slowSolution
{


    // 9 5
    // 2 3 4 2 3 6 8 4 5

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        //nr of days
        int n = in.nextInt();
        //nr of trailing days
        int d = in.nextInt();
        //expenditure
        int[] expenditure = new int[n];
        List<Integer> expenditureList = new ArrayList<>();
        System.out.println("PRE SORTING");
        for (int i = 0; i < n; i++)
        {
            int temp = in.nextInt();
            expenditure[i] = temp;
            expenditureList.stream().distinct().collect(Collectors.toList());
            System.out.println(expenditure[i]);
        }

        //        SORTING AN ARRAY
        //        Arrays.sort(expenditure);
        //        System.out.println("AFTER SORTING");
        //        for (int i = 0; i < n; i++)
        //        {
        //            System.out.println(expenditure[i]);
        //        }

        System.out.println("Number of fraudes: " + activityNotifications(expenditure, d));
        System.out.println("------------ // FIM // ------------");
    }

    static int activityNotifications(int[] expenditure, int d)
    {
        int counter = 0;
        List<Integer> expenditureList = new ArrayList<>();
        for (int i = 0; i < expenditure.length; i++)
        {
            expenditureList.add(expenditure[i]);
        }

        //for every days
        for (int i = d; i < expenditure.length; i++)
        {
            System.out.println("round" + i);

            List<Integer> tempExpenses = expenditureList.subList(i - d, i);
            Collections.sort(tempExpenses);
            double tempMedian;
            if (tempExpenses.size() % 2 == 0)
            {
                tempMedian = ((double) tempExpenses.get(tempExpenses.size() / 2) + (double) tempExpenses.get(tempExpenses.size() / 2 - 1)) / 2;
                System.out.println("even");
            }
            else
            {
                tempMedian = (double) tempExpenses.get(tempExpenses.size() / 2);
                System.out.println("odd");
            }

            if (expenditureList.get(i) >= 2 * tempMedian)
            {
                counter++;
                System.out.println("!! -- FRAUDE FRAUDE FRAUDE FRAUDE FRAUDE -- !!");
            }

        }
        return counter;
    }
}

