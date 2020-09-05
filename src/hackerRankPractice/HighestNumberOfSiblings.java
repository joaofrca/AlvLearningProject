package hackerRankPractice;

public class HighestNumberOfSiblings
{

    public static void main(String[] args)
    {
        int n = 543333958;
        System.out.println(highestNumberOfSiblings(n));
    }

    private static int highestNumberOfSiblings(int n)
    {
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        int[] frequency = new int[10];

        for (int i = 0; i < s.length(); i++)
            frequency[s.charAt(i)-48]++;
        for (int j = frequency.length - 1; j > -1; j--)
        {
            if (frequency[j] == 0) continue;
            for (int m = 0 ; m < frequency[j]; m++)
            result.append(j);
        }
        return Integer.parseInt(result.toString());
    }

}
