import java.util.Scanner;
public class Table{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = 1;
        for(int i = a; i<=b;i++)
        {
            m = n*i;
            System.out.println(n +" x "+ i +" = "+ n*i);
        }
    }
}