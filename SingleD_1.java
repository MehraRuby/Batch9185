import java.util.Scanner;

class SingleD_1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("\nEnter the values: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }

}