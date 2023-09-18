package A1ThreadsVererbung;

public class erzeugeThreads {

    public static void main(String[] args) {

        System.out.println("Erzeuge Thread gestartet");

        // Thread Objekt erstellen
        MyThread a = new MyThread("a", 100);
        MyThread b = new MyThread("b", 30);

        // Thread starten
        a.start();
        b.start();

        System.out.println("Main Thread zu ende");
    }

}