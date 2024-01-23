import java.util.Scanner;
public class Swap{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("%d
",a);
        System.out.printf("%d",b);
    }
}