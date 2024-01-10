import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float a = r*r*3.14F;
        System.out.printf("%.2f",a);
    }
}