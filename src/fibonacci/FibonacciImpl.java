package fibonacci;
//import Scanner;
//import java.util.Scanner;

public class FibonacciImpl implements Fibonacci
{

    @Override
    public int fibonacciForCycle(int n)
    {
        int bef = 0;
        int aft = 1;
        int result = 0;
        for (int i = 2; i < n + 1; i++)
        {
            result = bef + aft;
            bef = aft;
            aft = result;
        }
        return result;
    }

}