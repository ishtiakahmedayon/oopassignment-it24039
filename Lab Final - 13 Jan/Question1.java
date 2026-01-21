import java.util.Scanner;

public class ReverseArray {

    public static void reverse(double[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            double temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        reverse(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }

        sc.close();
    }
}
