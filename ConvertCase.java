public class ConvertCase {
    public static void main(String[] arg) {
        String str = new String("programming");
        char ch[] = new char[str.length()];

        // convert string in charcter array
        ch = str.toCharArray();

        int temp;

        // change ASCII value of ch index with upper case ASCII value
        for (int i = 0; i < ch.length; i++) {
            temp = ch[i] - 32; // change ascii value from lower case to upper case letter
            ch[i] = (char) temp; // typecasting

        }

        // convert character array in String format
        String upperletters = new String(ch);
        System.out.println(upperletters);

    }

}



