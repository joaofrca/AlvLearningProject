package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortedMarks
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //nr of elements
        int n = in.nextInt();

        int k = in.nextInt();
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            int temp = in.nextInt();
            marks.add(temp);
        }

        List<Integer> sortedMarks = marks;
        Collections.sort(sortedMarks);
        int numberOfMarks = marks.size();
        List<Integer> noDuplicateMarks = sortedMarks
                .stream()
                .distinct()
                .collect(Collectors.toList());

        int limit = 0;

        if (noDuplicateMarks.size()-k > 0){
            limit = noDuplicateMarks.size()-k;
        }
        int threshold = noDuplicateMarks.get(limit);

        //for (int j = 0; j < numberOfMarks; j++){
        //if (marks.get(j) >= threshold){
        //    return numberOfMarks - j;
        //}
        //}
        int counter = 0;
        for (int j = 0; j < numberOfMarks; j++){
            if (marks.get(j) >= threshold){
                counter++;
            }}
        System.out.println(counter);
    }

}

