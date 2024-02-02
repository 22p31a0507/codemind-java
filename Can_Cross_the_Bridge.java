import java.util.Scanner;
public class Cross{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = (d-c)/b;
        System.out.println(e);
    }
}