package sortingToys;

import java.util.Arrays;

public class ToysMain
{

    public static void main(String[] args)
    {
        //Método para inputs
        int budget = 543;
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};

        Arrays.sort(prices);
        ToysImpl toysResult = new ToysImpl();
        System.out.println("I got " + budget);
        System.out.println("I bought " + toysResult.getNToysBought(budget,prices));
        System.out.println("I spent " + toysResult.getNSpent(budget,prices));
    }
}
