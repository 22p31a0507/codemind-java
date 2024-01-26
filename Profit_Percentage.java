import java.util.Scanner;
public class Profit{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float cp = sc.nextFloat();
        float sp = sc.nextFloat();
        float p = sp - cp;
        float b = p/cp;
        System.out.printf("%.2f",b*100);
    }
} 