package immutable.stringbuilder.custom;

public class MyStringBuilderMain {

    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.append("!");

        System.out.println(sb.toString()); // Output: Hello world!
        System.out.println(sb.length()); // Output: 12
    }
}
