package immutable.wrapper;

public class StringImmutability {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" world");
        String str3 = str1.toUpperCase();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
