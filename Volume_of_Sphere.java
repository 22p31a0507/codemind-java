import java.util.Scanner;
public class Volume{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.printf("%.2f",(3.14*a*a*a)*4/3);
    }
}