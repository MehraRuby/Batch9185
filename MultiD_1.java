import java.util.Scanner;

public class MultiD_1 {
    public static void main(String[] g) {
        int[][] arr = new int[3][2];

        Scanner sc = new Scanner(System.in);

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println("Enter : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array is : \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
