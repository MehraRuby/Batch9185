import java.util.Scanner;

public class DialogSum {
    public static void main(String[] arg) {
        int arr[][] = new int[4][4];

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the values in matrix:");

        // insert the userdefined values in an multi D array
        for (int i = 0; i < arr.length; i++) // rows
        {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Matrix is :

        for (int i = 0; i < arr.length; i++) // rows
        {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Left Side
        System.out.println("Left Diagonal");

        for (int i = 0; i < arr.length; i++) // rows
        {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }

        // Right Side
        int m = arr.length - 1;
        System.out.println("\nRight Diagonal");
        for (int i = 0; i < arr.length; i++) // rows
        {
            for (int j = 0; j < arr[i].length; j++) {
                if (m == j) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            m--;
        }

    }
}
