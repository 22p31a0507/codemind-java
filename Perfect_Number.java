import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        for(int i = 1;i < n;i++)
        {
            if(n%i == 0)
            {
                p += i;
            }
        }
        if(p == n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}