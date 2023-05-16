package wildcard;

import java.util.ArrayList;
import java.util.List;

public class SuperWildcardExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(numberList);

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
        System.out.println(objectList);
    }
}
