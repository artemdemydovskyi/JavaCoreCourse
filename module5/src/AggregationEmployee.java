import java.util.Objects;

public class AggregationEmployee  {

    private final int id;
    private final String name;
    private final Address address;

    public AggregationEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AggregateEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AggregationEmployee that = (AggregationEmployee) o;

        if (id != that.id) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}

  class Address {

    private final String street;
    private final String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Address address = (Address) o;

          if (!Objects.equals(street, address.street)) return false;
          return Objects.equals(city, address.city);
      }

      @Override
      public int hashCode() {
          int result = street != null ? street.hashCode() : 0;
          result = 31 * result + (city != null ? city.hashCode() : 0);
          return result;
      }
  }