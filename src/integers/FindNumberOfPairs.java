package integers;

import java.io.IOException;

/**
 * For a given array of integers and k, output the number of times that i-j=k within the array (like little pairs).
 */
public class FindNumberOfPairs
{

    public static void main(String[] args) throws IOException
    {
        //        INPUT BEGIN
        int[] intArray = {3, 4, 3, -1, 1000, 1, 2, 5};

        int k = 1;
        //        INPUT END

        System.out.println("The bloody result is " + pairs(k,intArray));
    }

    static int pairs(int k, int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i!=j && k ==(arr[i]-arr[j])) { counter++; }
            }
        }
        return counter;
    }


}

