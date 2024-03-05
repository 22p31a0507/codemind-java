import java.util.Scanner;

public class EvenDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int num : arr) {
            if (countDigits(num) % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
        
    }
}
