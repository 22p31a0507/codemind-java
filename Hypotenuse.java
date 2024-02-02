import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a*a)+(b*b);
        double d = Math.sqrt(c);
        System.out.printf("%.2f",d);
    }
}