package hackerRankPractice;

public class Test
{

    Test(){
        String joao = "joao";
    }

    public static void main(String[] args)
    {
        System.out.println("here");
    }
}

class TestChild extends Test
{

    TestChild(Integer inteiro){
        inteiro = 1;
    }

    public static void main(String[] args)
    {
        System.out.println("here");
    }
}
