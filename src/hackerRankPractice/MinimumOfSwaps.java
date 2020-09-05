package hackerRankPractice;

public class MinimumOfSwaps
{
    //https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    public static void main(String[] args)
    {
        int[] arr = {7, 4, 2, 1, 3, 5, 6};
        boolean[] organizedQ = new boolean[arr.length];
        int cycleSize = 0;
        int nSwaps = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(organizedQ[i] == false){
                int j = i;
                do{
                    cycleSize++;
                    organizedQ[j]=true;
                    j=arr[j]-1;
                } while (j!=i);
                nSwaps += (cycleSize - 1);
                cycleSize = 0;
            }
        }
        System.out.println(nSwaps);
    }

}
