import java.util.Scanner;
public class Years{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = a/365;
        int w = (a%365)/7;
        System.out.printf("%d
",y);
        System.out.printf("%d
",w);
    }
}