import java.util.Scanner;
public class Sum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        for(int i=0;i<=a;i++)
        {
            s += i;
        }
        System.out.println(s);
    }
}