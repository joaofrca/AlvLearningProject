package hackerRankPractice;

public class MinimumNumberOfDeletions
{

    //Minimum number of deletions
    //https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
    public static void main(String[] args)
    {
        //TC1
        String a = "AABAAB";
        System.out.println(minNumberOfDeletions(a));
    }

    private static int minNumberOfDeletions(String s)
    {
        if (null == s)
        {
            System.out.println("Null arguments...");
            return -1;
        }
        int result = 0;
        for(int i = 1; i < s.length(); i++ )
            if (s.charAt(i) == s.charAt(i-1)) result++;
        return result;
    }

}
