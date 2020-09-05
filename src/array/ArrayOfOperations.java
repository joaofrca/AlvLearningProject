package array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class ArrayOfOperations
{

    //input example:
    //5 3
    //1 2 100
    //2 5 100
    //3 4 100

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        //nr of zeros
        int n = in.nextInt();
        //nr of operations
        int m = in.nextInt();
        //results
        int[] results = new int[n];
        //bigger int
        int bigger = 0;
        //array of operations
        List<int[]> operations = new ArrayList<>();

        for (int i = 0; i < m; i++)
        {
            int op[] = new int[3];
            for (int j = 0; j < 3; j++)
            {
                op[j] = in.nextInt();
            }
            operations.add(op);
            for (int j = operations.get(i)[0] - 1; j <= operations.get(i)[1] - 1; j++)
            {
                results[j] = results[j] + operations.get(i)[2];
//                System.out.println(results[j]);
                if (results[j] > bigger)
                {
                    bigger = results[j];
                }
            }
        }

//        for (int i = 0; i < m; i++)
//        {
//            for (int j = operations.get(i)[0] - 1; j <= operations.get(i)[1] - 1; j++)
//            {
//                results[j] = results[j] + operations.get(i)[2];
//                System.out.println(results[j]);
//                if (results[j] > bigger)
//                {
//                    bigger = results[j];
//                }
//            }
//        }

        System.out.println("Hey, the result is: " + bigger);
    }
}

//NICER SOLUTION:
//Scanner scan = new Scanner(System.in);
//    int n = scan.nextInt();
//    int m = scan.nextInt();
//
//    //This will be the "difference array". The entry arr[i]=k indicates that arr[i] is exactly k units larger than arr[i-1]
//    long[] arr = new long[n];
//
//    int lower;
//    int upper;
//    long sum;
//
//for(int i=0;i<n;i++) arr[i]=0;
//
//        for(int i=0;i<m;i++){
//        lower=scan.nextInt();
//        upper=scan.nextInt();
//        sum=scan.nextInt();
//        arr[lower-1]+=sum;
//        if(upper<n) arr[upper]-=sum;
//        }
//
//        long max=0;
//        long temp=0;
//
//        for(int i=0;i<n;i++){
//        temp += arr[i];
//        if(temp> max) max=temp;
//        }
//
//        System.out.println(max);
