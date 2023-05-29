package pecs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//PECS = Producer extends Consumer supplies
public class Main {
    public static void main(String[] args) {
        // assignment
        List<? extends Number> list1 = new ArrayList<Integer>(); //Producer extends
        List<? super Integer> list2 = new ArrayList<Integer>(); //Consumer supplies

// taking， suppose not empty
        Number num1 = list1.get(0); // why works fine?
//        Integer num2 = list2.get(0); // why compiler-error?

// putting
//        list1.add(45); // why compiler-error?
        list2.add(45); // why works fine?


        changer(returnIntList());
    }

    public static <T extends Number> List<T> changer(List<T> numbers) {
        return numbers;
    }


    public static List<? extends Number> changer2(List<? extends Number> numbers) {
        return numbers;
    }


    public static List<Integer> returnIntList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        return integerList;
    }
}


