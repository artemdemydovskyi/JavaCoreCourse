package innerclasses.local_or_anonymous;

public interface MyInterface {
    void doSomething();
}

/*
    A local inner class consists of a class declared within a method,
    whereas an anonymous class is declared when an instance is created.
    So the anonymous class is created on the fly or during program execution.
 */
 class MyClass {
    public void myMethod() {
        // Local class
        class MyLocalClass implements MyInterface {
            public void doSomething() {
                System.out.println("Hello from MyLocalClass!");
            }
        }

        // Anonymous class
        MyInterface myAnonymousClass = new MyInterface() {
            public void doSomething() {
                System.out.println("Hello from myAnonymousClass!");
            }
        };
        MyInterface myAnonymousClass1 = new MyInterface() {
            public void doSomething() {
                System.out.println("Hello from myAnonymousClass!");
            }
        };
        MyInterface myAnonymousClass2 = new MyInterface() {
            public void doSomething() {
                System.out.println("Hello from myAnonymousClass!");
            }
        };

        // Call the methods
        MyLocalClass myLocalObject = new MyLocalClass();
        MyLocalClass mylocalObject2 = new MyLocalClass();
        MyLocalClass mylocalObject3 = new MyLocalClass();
        myLocalObject.doSomething();


        myAnonymousClass.doSomething();
    }
}