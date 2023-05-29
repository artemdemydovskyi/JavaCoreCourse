
public class Main {
    public static void main(String[] args) {
        var compositionEmployee = new CompositionEmployee(1, "John", "street 1", "city 1");
        System.out.println(compositionEmployee);
        //___________________________________________________________________________________________________
        Address address = new Address("street 1", "city 1");
        var aggregationEmployee = new AggregationEmployee(1, "Tim", address);
        System.out.println(aggregationEmployee);
    }


}