package sortingToys;

/**
 * Explain interface purpose
 */
public interface Toys
{
    /**
     *
     * @param budget
     * @param prices
     * @return
     */
    public int getNSpent(int budget, int[] prices);

    /**
     *
     * @param budget
     * @param prices
     * @return
     */
    public int getNToysBought(int budget, int[] prices);

}
