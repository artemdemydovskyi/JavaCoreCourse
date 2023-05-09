package interfaces.difficultcases;

interface MyInterface {
    default void myMethod() {
        System.out.println("Default method in MyInterface");
    }
}

class MySuperclass {
    public void myMethod() {
        System.out.println("Method in MySuperclass");
    }
}

class MySubclass extends MySuperclass implements MyInterface {
    // No implementation needed here
}

public class Main {
    public static void main(String[] args) {
        MySubclass obj = new MySubclass();
        obj.myMethod(); // This will call the method in MySuperclass
    }
}
