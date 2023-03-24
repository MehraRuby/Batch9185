public class SumEvenOdd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        int arr[] = { 56, 87, 34, 98, 90, 21, 78, 43, 9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even = even + arr[i];
            else
                odd = odd + arr[i];
        }
        System.out.println("Sum of Even :  " + even);
        System.out.println("Sum of Odd :  " + odd);
    }
}
