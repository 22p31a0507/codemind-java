import java.util.Scanner;
public class Temperature
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        float f = (c*(float)9/5)+32F;
        System.out.printf("%.2f",f);
    }
}