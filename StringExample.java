class StringExample {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";

        String str3 = new String("java");
        String str4 = new String("Java");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        if (str1 == str3)
            System.out.println("str1 and str3 are equals");
        else
            System.out.println("str1 and str3 are not equals");

        if (str1.equals(str3))
            System.out.println("str1 and str3 are equals");
        else
            System.out.println("str1 and str3 are not equals");

    }
}
