package lambda;

import java.util.function.Function;

public class UseFoo {

    //effectively final


    public String add(final String string, final Foo foo) {
        return foo.method(string);
    }

    public String addWithStandardFI(final String string, final Function<String, String> fn) {
        return fn.apply(string);
    }

    public String scopeExperiment() {

         final String VALUE = "Enclosing scope value";

        final Foo superFoo = new Foo() {
            final String value = "Inner class value";

            @Override
            public String method(final String string) {
                return this.value;
            }
        };
        final String resultIC = superFoo.method("");

        final Foo fooLambda = (parameter) -> {
            return VALUE;
        };

        final String resultLambda = fooLambda.method("");

        return "Results: resultIC = " + resultIC + ", resultLambda = " + resultLambda;
    }

    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();
        useFoo.scopeExperiment();
    }

}