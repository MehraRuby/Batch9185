//q: Reverse each word of a senetence
public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String arr[] = str.split(" ");
        StringBuffer sb;

        str = "";
        for (String s : arr) {
            /*
             * 1 way
             * sb = new StringBuffer(s);
             * sb = sb.reverse();
             * str = str + sb.toString() + " ";
             */
            // 2 way
            str = str + new StringBuffer(s).reverse().toString() + " ";
        }
        System.out.println(str);
    }
}
