package testPreparation;

import java.io.IOException;

/**
 *
 */
public class EmptyB2
{

    public static void main(String[] args) throws IOException
    {
        int n = 955;
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0)
        {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        for (int j = 0; j<d.length; j++)
        {
            System.out.println(d[j]);
        }


        for (p = 1; p < 1 + l; ++p)
        {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i)
            {
                if (d[i] != d[i + p])
                {
                    ok = false;
                    break;
                }
            }
            if (ok)
            {
                System.out.println("RESOLVI " + p);

            }
        }
        System.out.println("-1");

    }
}




