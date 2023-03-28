public class CompareString {
    public static void main(String[] args) {
        String str1 = "program";
        String str2 = "PROGRAM";

        int result = str1.compareToIgnoreCase(str2);
        if (result == 0)
            System.out.println("Both string are same");
        else if (result > 0)
            System.out.println("String 1 is greater ");
        else
            System.out.println("String 2 is greater ");
    }
}
