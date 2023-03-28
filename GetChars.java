public class GetChars {
    public static void main(String[] args) {
        String str = new String("Programming");

        // character array
        char dst[] = new char[20];
        str.getChars(3, 7, dst, 0);

        // conversion
        // char array get converetd into string

        String str1 = new String(dst);
        System.out.println(str1);

        char result[] = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
