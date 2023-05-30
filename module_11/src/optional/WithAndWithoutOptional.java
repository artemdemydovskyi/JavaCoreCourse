package optional;

import java.util.Optional;
import java.util.UUID;

//NullPointerException NPE

//Person person = null;
//person.getName();
//person.setAge()

public class WithAndWithoutOptional {
    public static void main(String[] args) {


        // Example with Optional
        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Optional Value: " + value));

        // Example without Optional
        String value = "Hello";
        if (value != null) {
            System.out.println("Non-Optional Value: " + value);
        }
    }

    public static Optional<Client> getClient(UUID indentificationCode) {
        return Optional.ofNullable(new Client());
    }
//
//    public static String checkClientAccount(Client client) {
//        Optional<Client> client1 = getClient(client.getIdentifier());
//        if (client1.isPresent()) {
//            String account = client1.get().getAccount();
//        } else {
//            throw new RuntimeException();
//        }
//        Client client2 = client1.orElseThrow(RuntimeException::new);
//
////        client1.ifPresent(value -> getClient());
//    }
}
