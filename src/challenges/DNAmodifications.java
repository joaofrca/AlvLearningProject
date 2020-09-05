package challenges;

public class DNAmodifications
{

    public static void main(String[] args)
    {
        String s = "CGAATG";
        System.out.println(dnaComplement(s));
    }

    // Invert a string, replace A fot T and C for G (and otherwise too)
    public static String dnaComplement(String s)
    {
        StringBuilder reversed = new StringBuilder();
        String res = reversed.append(s).reverse().toString();

        return res.replaceAll("[A]", "1")
                .replaceAll("[T]", "2")
                .replaceAll("[C]", "3")
                .replaceAll("[G]", "4")
                .replaceAll("[1]", "T")
                .replaceAll("[2]", "A")
                .replaceAll("[3]", "G")
                .replaceAll("[4]", "C");
    }

    public static String dnaSuperComplement( String st)
    {
        StringBuilder rev = new StringBuilder();
        String res = rev.append(st).reverse().toString();

        return res.replaceAll("[A]", "1")
                .replaceAll("[T]", "2")
                .replaceAll("[C]", "3")
                .replaceAll("[G]", "4")
                .replaceAll("[1]", "T")
                .replaceAll("[2]", "A")
                .replaceAll("[3]", "G")
                .replaceAll("[4]", "C");
    }
}
