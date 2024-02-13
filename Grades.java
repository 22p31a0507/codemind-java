import java.util.Scanner;
public class Grades{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int cs = sc.nextInt();
        double a = (p+c+b+m+cs)/5;
        if(a >= 90)
        {
            System.out.println("Grade A");
        }
        else if(a >= 80)
        {
            System.out.println("Grade B");
        }
        else if(a >= 70)
        {
            System.out.println("Grade C");
        }
        else if(a >= 60)
        {
            System.out.println("Grade D");
        }
        else if(a >= 40)
        {
            System.out.println("Grade E");
        }
        else if(a < 40)
        {
            System.out.println("Grade F");
        }
    }
}