/*Find greater number from an array*/

public class GreaterNumber {
    public static void main(String[] arg) {
        int temp = 0;
        int min = Integer.MAX_VALUE;
        int arr[] = { 67, 56, 98, 23, 1, 92, 45 };

        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Largest Value : " + temp);
        System.out.println("Smallest Value : " + min);
    }
}
