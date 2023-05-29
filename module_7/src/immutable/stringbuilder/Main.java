package immutable.stringbuilder;

public class Main {

    public static void main(String [] args){
        StringBuilder sentenceBuilder = new StringBuilder();
        sentenceBuilder.append("I ");
        sentenceBuilder.append("like ");
        sentenceBuilder.append("using ");
        sentenceBuilder.append("StringBuilder ");
        sentenceBuilder.append("in ");
        sentenceBuilder.append("Java.");
        String sentence = sentenceBuilder.toString();
        System.out.println(sentence);
// Output: I like using StringBuilder in Java.


        StringBuilder listBuilder = new StringBuilder();
        listBuilder.append("apples");
        listBuilder.append(",");
        listBuilder.append("oranges");
        listBuilder.append(",");
        listBuilder.append("bananas");
        String list = listBuilder.toString();
        System.out.println(list);
// Output: apples,oranges,bananas

    }
}
