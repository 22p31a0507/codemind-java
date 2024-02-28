import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = 0;
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
        {
            int p =(int)Math.sqrt(arr[i]);
            int b = p*p;
            if(arr[i] == b)
            {
                a += arr[i];
            }
        }
        System.out.println(a);
    }
}