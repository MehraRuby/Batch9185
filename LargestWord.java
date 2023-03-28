public class LargestWord {
    public static void main(String[] args) {
        String str = "Java is a programming language. It is platform independent.";
        String result[] = str.split(" ");

        int len, temp = 0;
        String res = "";

        for (String s : result) {
            len = s.length();
            System.out.println(s + " " + len);
            if (temp < len) {
                temp = len;
                res = s;
            }
        }
        System.out.println("Largest String : " + res);

    }

}
