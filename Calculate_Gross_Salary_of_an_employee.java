import java.util.Scanner;
public class Salary{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float bs = sc.nextFloat();
        float hra = sc.nextFloat();
        float da  = sc.nextFloat();
        float pf1 = (bs/100);
        float pf2 = pf1*12;
        float gs = bs+hra+da+pf2;
        System.out.printf("%.2f
",pf2);
        System.out.printf("%.2f",gs);
    }
}