package org.example.mainissues;

public class Deadlock {

    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + "  ,вклонись мені!%n", this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " вклонився мені у відповідь!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Альфонсо");
        final Friend gaston =
                new Friend("Гастоне");
        new Thread(() -> {
            alphonse.bow(gaston);
        }).start();

        new Thread(() -> {
            gaston.bow(alphonse);
        }).start();
    }
}