package A4ThreadsStoppen;

import java.util.Scanner;

public class Counter implements Runnable {
    private static final int COUNT_LIMIT = 100;
    private static volatile boolean shouldRun = true;
    private int counter = 1;

    @Override
    public void run() {
       System.out.println("Thread startet");
        while (shouldRun = true) {

            System.out.println("Current Count" + getCount());
            ;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                shouldRun = false;
            }

        }

    }

    public int getCount() {
        return counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> new Counter()).start();

        Scanner scanner = new Scanner(System.in);

        while (scanner.nextLine().toLowerCase().startsWith("q")) {
            shouldRun = false;

        }
    }

}
