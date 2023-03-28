public class ChatAtFunction {
    public static void main(String[] args) {
        String str = "12981";
        String result = "";

        // System.out.println(str.charAt(7));

        int len = str.length() - 1;

        for (int i = len; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        System.out.println("Reversed String is : " + result);
    }

}
