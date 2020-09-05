package hackerRankPractice;

public class HourGlassSum
{

    //Arrays
    //https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    public static void main(String[] args)
    {
        int[][] arr = new int[6][6];
        arr[0][0] = 1; arr[0][1] = 1; arr[0][2] = 1; arr[0][3] = 0; arr[0][4] = 0; arr[0][5] = 0;
        arr[1][0] = 0; arr[1][1] = 1; arr[1][2] = 0; arr[1][3] = 0; arr[1][4] = 0; arr[1][5] = 0;
        arr[2][0] = 1; arr[2][1] = 1; arr[2][2] = 1; arr[2][3] = 0; arr[2][4] = 0; arr[2][5] = 0;
        arr[3][0] = 0; arr[3][1] = 0; arr[3][2] = 2; arr[3][3] = 4; arr[3][4] = 4; arr[3][5] = 0;
        arr[4][0] = 0; arr[4][1] = 0; arr[4][2] = 0; arr[4][3] = 2; arr[4][4] = 0; arr[4][5] = 0;
        arr[5][0] = 0; arr[5][1] = 0; arr[5][2] = 1; arr[5][3] = 2; arr[5][4] = 4; arr[5][5] = 0;
        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr)
    {
        if (null == arr){
            System.out.println("Null pointer.");
            return 0;
        }

        int hourglassSum = 0;
        int possibleHourglassSum;
        for(int i = 0; i < arr[0].length - 2; i++)
            for(int j = 0; j < arr[1].length - 2; j++)
            {
                possibleHourglassSum = calculateHourGlassForIndexes(arr,i,j);
                if (possibleHourglassSum > hourglassSum || (i == 0 && j == 0)) hourglassSum = possibleHourglassSum;
            }
        return hourglassSum;
    }

    private static int calculateHourGlassForIndexes(int[][] arr, int i, int j)
    {
        return arr[i][j]
                + arr[i][j + 1]
                + arr[i][j + 2]
                + arr[i + 1][j + 1]
                + arr[i + 2][j]
                + arr[i + 2][j + 1]
                + arr[i + 2][j + 2];
    }

}
