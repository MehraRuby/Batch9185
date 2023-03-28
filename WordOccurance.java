public class WordOccurance {
    public static void main(String[] args) {
        String str = "hello Java ! . Java is a programming language. Hello World ! Hello Java ";

        String st[] = str.split(" ");

        // shows the index id of first occurance of each word
        /*
         * for (String s : st) {
         * System.out.println(s + " " + str.indexOf(s));
         * }
         */

        // to find the count of each word
        int count = 0;
        for (String s : st) {
            for (int i = 0; i < st.length; i++) {
                if (s.equals(st[i])) {
                    count++;
                    if (count > 1) {
                        st[i] = "";
                    }
                }
            }
            if (!s.equals("")) {
                System.out.println(s + " " + count);
            }
            count = 0;

        }

    }
}

