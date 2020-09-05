package fibonacci;

public class FibonacciImpl implements Fibonacci
{

    @Override
    public int fibonacciForCycle(int n)
    {
        int bef = 0;
        int aft = 1;//
        int result = 0;
        for (int i = 2; i < n + 1; i++)
        {
            result = bef + aft;
            bef = aft;
            aft = result;
        }
        return result;
    }

    @Override
    public void printAllFibonacciNumbersUntilN(int n)
    {
        //pedido: 3
        //Result: 0 1 1
        int fibonacciNumber=0;
        if (n <= 0){
            System.out.println("Not possible to calculate.");
        }
        else if (n == 1) {
            System.out.println(fibonacciNumber);
        }
        else if (n == 2) {
            System.out.println(++fibonacciNumber);
        }
        else{
            int nZero = 0;
            int nOne = 1;
            for (int i = 0; i < n-2; i++)
            {
                fibonacciNumber = nZero + nOne;
                nZero = nOne;
                nOne = fibonacciNumber;
                System.out.println(fibonacciNumber);
            }
        }
    }

}