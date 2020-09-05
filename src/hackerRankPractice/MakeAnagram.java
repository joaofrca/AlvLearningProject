package hackerRankPractice;

import java.util.Arrays;

public class MakeAnagram
{

    //ANAGRAMS
    //https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
    public static void main(String[] args)
    {
//        //TC1 //2
//        String a = "joao1";
//        String b = "joao2";
        //TC2 //3
        String a = "bcadeh";
        String b = "hea";
//        //TC3 //2
//        String a = "cddgk";
//        String b = "gcd";
//        //TC4 //0
//        String a = "bca";
//        String b = "acb";

        System.out.println(makeAnagram(a, b));
    }

    private static int makeAnagram(String a, String b){

        if (null == a || null == b)
        {
            System.out.println("Null arguments...");
            return -1;
        }

        int numberOfChanges = 0;
        //int array for each character in the alphabet
        int[] countA = new int[128];
        int[] countB = new int[128];

        for (int i = 0; i < a.length(); i++)
            countA[a.charAt(i)]++;
        for (int i = 0; i < b.length(); i++)
            countB[b.charAt(i)]++;
        for (int i = 0; i < countA.length; i++)
            numberOfChanges += Math.abs(countA[i] - countB[i]);
        return numberOfChanges;
    }

    private static boolean areStringsAnagram(String a, String b)
    {
        if (null == a || null == b || a.length() != b.length())
            return false;
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }

}
