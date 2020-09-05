package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest
{

    @Before
    public void beforeEach()
    {
        //import cenas
    }

    @Test
    public void test3()
    {
        FibonacciImpl myFib = new FibonacciImpl();
        assertThat(myFib.fibonacciForCycle(3), is(2));
    }

    @Test
    public void test6()
    {
        FibonacciImpl myFib = new FibonacciImpl();
        assertThat(myFib.fibonacciForCycle(6), is(8));
    }

    @Test
    public void test30()
    {
        FibonacciImpl myFib = new FibonacciImpl();
        assertThat(myFib.fibonacciForCycle(30), is(832040));
    }

}