import java.util.Scanner;
public class Wireframe{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 2*(a+b);
        System.out.println(c*d);
    }
}