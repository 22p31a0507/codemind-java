import java.util.Scanner;
public class Rainfall{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 3)
        {
            System.out.println("LIGHT");
        }
        else if(a == 3 || a < 7)
        {
            System.out.println("MODERATE");
        }
        else
        {
            System.out.println("HEAVY");
        }
    }
}