import java.util.Scanner;
public class Climbing{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            int d = a%b;
            int e = c+d;
            System.out.println(e);
        }
    }
}