public class ShallowCopy {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 },
                { 2, 3, 4, 5, 6 },
                { 3, 4, 5, 6, 7 },
                { 4, 5, 6, 7, 8 }
        };

        int copiedarr[][] = arr.clone();

        arr[1][2] = 9000;

        System.out.println("Arr: \n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nCopied array :\n ");
        for (int i = 0; i < copiedarr.length; i++) {
            for (int j = 0; j < copiedarr[i].length; j++) {
                System.out.print(copiedarr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
