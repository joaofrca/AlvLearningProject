//package sortingToys;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
//
//public class ToysTest
//{
//
//    @Before
//    public void beforeEach()
//    {
//        //import cenas
//    }
//
//    @Test
//    public void test1()
//    {
//        int budget = 7;
//        int[] prices = {1, 2, 3, 4};
//        ToysImpl toys = new ToysImpl();
//
//        assertThat(toys.getNToysBought(budget, prices), is(3));
//        assertThat(toys.getNSpent(budget, prices), is(6));
//    }
//
//    @Test
//    public void test2()
//    {
//        int budget = 50;
//        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
//        ToysImpl toys = new ToysImpl();
//
//        assertThat(toys.getNToysBought(budget, prices), is(4));
//        assertThat(toys.getNSpent(budget, prices), is(28));
//    }
//
//}
