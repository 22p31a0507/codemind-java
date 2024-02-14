import java.util.Scanner;
public class Bill{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1= sc.nextLine();
        int a = sc.nextInt();
        double unitCharge,totalBill;
        if(a <= 199)
        {
            unitCharge = 1.20;
        }
        else if(a >= 200 && a < 400)
        {
            unitCharge = 1.50;
        }
        else if(a >= 400 && a < 600)
        {
            unitCharge = 1.80;
        }
        else
        {
            unitCharge = 2.00;
        }
        totalBill = a*unitCharge;
        if(totalBill > 400)
        {
            System.out.printf("%.2f",totalBill+totalBill*0.15);
        }
        else
        {
            System.out.printf("%.2f",totalBill+100);
        }
    }
}