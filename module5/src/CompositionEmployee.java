public class CompositionEmployee {

    private final int id;
    private final String name;
    private final Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        CompositionEmployee that = (CompositionEmployee) o;

        if (this.id != that.id) return false;
        if (!this.name.equals(that.name)){ return false;}
        return this.address.equals(that.address);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        result = 31 * result + (this.address != null ? this.address.hashCode() : 0);
        return result;
    }

    public CompositionEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street, city);
    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private static class Address {

        private final String street;
        private final String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Address address = (Address) o;

            if (!this.street.equals(address.street)) return false;
            return this.city.equals(address.city);
        }

        @Override
        public int hashCode() {
            int result = street != null ? street.hashCode() : 0;
            result = 31 * result + (city != null ? city.hashCode() : 0);
            return result;
        }
    }

}