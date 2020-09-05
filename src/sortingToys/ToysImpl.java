package sortingToys;

import java.util.Arrays;

public class ToysImpl implements Toys
{

    //REVER BALTAS
    @Override
    public int getNSpent(int budget, int[] prices)
    {
        int nSpent = 0;//, nToysBought = 0;
        Arrays.sort(prices);
        for (int p : prices)
        {
            if ((nSpent + p) <= budget)
            {
                nSpent = nSpent + p;
                //nToysBought++;
            }
            else
            {
                break;
            }
        }
        return nSpent;
    }

    @Override
    public int getNToysBought(int budget, int[] prices)
    {
        int nSpent = 0, nToysBought = 0;
        Arrays.sort(prices);
        for (int p : prices)
        {
            if ((nSpent + p) <= budget)
            {
                nSpent = nSpent + p;
                nToysBought++;
            }
            else
            {
                break;
            }
        }
        return nToysBought;
    }

}
