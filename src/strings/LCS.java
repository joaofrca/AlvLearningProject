package strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * For two given strings, find the number of characters of the longest string that can be formed by deleting zero or
 * more characters.
 * INPUT EXAMPLE:
 * PETER / REODTYYEIRP
 * OUTPUT EXAMPLE:
 * 4
 */
public class LCS
{
    //LCS - Longest common subsequence problem
    static int LCSProblem(String s1, String s2)
    {
        Integer[][] lcsMatrix = new Integer[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length() + 1; i++)
        {
            lcsMatrix[i][0] = 0;
        }
        for (int j = 0; j < s2.length() + 1; j++)
        {
            lcsMatrix[0][j] = 0;
        }
        for (int i = 1; i < s1.length() + 1; i++)
        {
            for (int j = 1; j < s2.length() + 1; j++)
            {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                {
                    lcsMatrix[i][j] = lcsMatrix[i - 1][j - 1] + 1;
                }
                else
                {
                    lcsMatrix[i][j] = Math.max(lcsMatrix[i][j - 1], lcsMatrix[i - 1][j]);
                }
            }
        }
        return lcsMatrix[s1.length()][s2.length()];
    }

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        int result = LCSProblem(s1, s2);
        System.out.println(" - - - RESULT IS: " + result + " - - -");
    }
}
