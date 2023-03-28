public class StringToByte {
    public static void main(String[] args) {
        String str = "This is a test program";

        int len = str.length();

        // conversion of character into bytes

        byte[] bt = str.getBytes();

        // enchanced for loop
        // for( variable : collection/array)
        for (byte a : bt) {
            System.out.print((char) a + "\t");
        }

        // separation of words from a sentence

        String result[] = str.split(" ");
        for (String re : result) {
            System.out.println(re);
        }

    }

}
