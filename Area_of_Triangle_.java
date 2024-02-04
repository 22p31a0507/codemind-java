import java.util.Scanner;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)*0.5;
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",A);
    }
}