package hackerRankPractice;

public class BalancedParenthesis
{
    //https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
    public static void main(String[] args)
    {
//        String s = "{[()]}";
        String s = "{[(])}";
//        String s = "{{[[(())]]}}";
        if (isBalanced(s))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static boolean isBalanced(String s)
    {
        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.add(s.charAt(i));
            }
            else if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && !isMatchingPair(stack.remove(), s.charAt(i)))
            {
                return false;
            }
        }
        if (!stack.isEmpty())
        {
            return false;
        }
        return true;
    }

    private static boolean isMatchingPair(char c1, char c2)
    {
        if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}'))
        {
            return true;
        }
        return false;
    }

    /**
     *
     */
    static class Stack
    {

        int position = -1;
        char[] stack = new char[500];

        void add(char c)
        {
            if (position == 500)
            {
                System.out.println("stack's full");
            }
            else
            {
                stack[++position] = c;
            }
        }

        char remove()
        {
            if (position == -1)
            {
                System.out.println("length error");
                return '\0';
            }
            else
            {
                return stack[position--];
            }
        }

        boolean isEmpty()
        {
            return position == -1;
        }
    }

}