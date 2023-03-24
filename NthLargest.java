import java.util.Scanner;

public class NthLargest {
    public static void main(String[] args) {
        int num;
        int arr[] = { 68, 89, 34, 65, 90, 32, 9, 7, 50 };
        int temp, loc = 0;
        int copiedarr[] = arr.clone();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the nth value : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            temp = 0;

            for (int m = 0; m < copiedarr.length; m++) {
                if (temp < copiedarr[m]) {
                    temp = copiedarr[m];
                    loc = m;
                }
            }
            copiedarr[loc] = 0;
        }
        System.out.println(num + " largest value is : " + arr[loc]);
    }
}
