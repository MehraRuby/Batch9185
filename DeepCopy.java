public class DeepCopy {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 30, 40, 50 };
        int copiedarr[] = arr.clone();

        arr[1] = 9000;

        System.out.println("Arr : \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nCopiedArr: \n");
        for (int i = 0; i < copiedarr.length; i++) {
            System.out.print(copiedarr[i] + "\t");
        }
    }

}
