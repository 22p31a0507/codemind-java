import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int y = 3*x-(a+b);
        System.out.println(y);
        
    }
}