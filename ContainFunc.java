public class ContainFunc {
    public static void main(String[] args) {
        String str = "hello Java! . Java is a programming language. Hello World ! Hello Java ";
        System.out.println(str.contains("hello") ? "True" : "False");
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.lastIndexOf("Hello") - 1);

    }

}
