import java.util.Scanner;
public class Loss{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float cp = sc.nextFloat();
        float sp = sc.nextFloat();
        float l = cp - sp;
        float b = l/cp;
        System.out.printf("%.2f",b*100);
    }
}