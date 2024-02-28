import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int av = 0;
        int a =0;
        int c =0;
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++)
        {
            av += arr[i];
            a = av/n;
        }
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == a)
            {
                c++;
            }
        }
        if(c >= 1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}