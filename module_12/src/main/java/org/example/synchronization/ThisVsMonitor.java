package org.example.synchronization;


public class ThisVsMonitor {
    private int counter = 0;
    private final Object lock = new Object();

    /**
     * Збільшує значення лічильника на 1 захищеною синхронізацією з використанням ключового слова 'this'.
     */
    public synchronized void incrementWithThis() {
        // Цей метод блокує весь об'єкт (this) для синхронізації
        counter++;
    }

    /**
     * Збільшує значення лічильника на 1 захищеною синхронізацією з використанням окремого монітора (lock).
     *
     * Завдяки використанню окремої змінної монітора, ви можете вибірково блокувати конкретні ділянки коду,
     * що дозволяє більш деталізовану синхронізацію. Це означає, що декілька потоків можуть виконувати різні синхронізовані методи
     * або блоки одночасно, за умови, що вони не конфліктують між собою, намагаючись отримати доступ до того самого монітора.
     */
    public void incrementWithMonitor() {
        synchronized (lock) {
            // Цей синхронізований блок блокує тільки код усередині нього за допомогою окремого монітора (lock)
            counter++;
        }
    }

    public static void main(String[] args) {
        ThisVsMonitor example = new ThisVsMonitor();

        // Створення потоків, що викликають різні синхронізовані методи
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.incrementWithThis();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.incrementWithMonitor();
            }
        });

        // Запуск потоків
        thread1.start();
        thread2.start();

        try {
            // Очікування завершення потоків
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Виведення значення лічильника
        System.out.println("Значення лічильника: " + example.counter);
    }
}
