import java.util.Scanner;
public class Donation{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b > a)
        {
            System.out.println(Math.abs(b-a));
        }
    }
}