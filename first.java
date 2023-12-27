import java.util.*;
public class first
{
    public static int abeer(int n)
    {
        int f;
        String s, s2 = "", s3;
        char c;
        s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i); //extracts each character
            s2 = c + s2; //adds each character in front of the existing string
        }
        f = Integer.parseInt(s2, 2);
        return f;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int c=abeer(n);
        int z;
        z=c;
        String s;
        s=Integer.toBinaryString(z);
        System.out.println(c+"("+s+")");
    }
}