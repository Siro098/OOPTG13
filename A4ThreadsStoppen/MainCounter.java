package A4ThreadsStoppen;

 

import java.util.Scanner;

 

/**

 * ErzeugeThreads

 */

public class MainCounter {

    public static volatile boolean shouldRun = true;

    public static void main(String[] args) {

        System.out.println("MyThread gestartet");

 

        // Threadobjekte erzeugen

        Counter a = new Counter(200);

 

        // Threads nebenläufig starten

        a.start();
        Scanner scanner = new Scanner(System.in);

        while (scanner.nextLine().toLowerCase().startsWith("q")) {
            shouldRun = false;
        }
       

        System.out.println("MyThread zuende");

 

       

 

    }

}