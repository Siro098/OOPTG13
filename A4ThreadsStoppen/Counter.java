package A4ThreadsStoppen;

 

public class Counter implements Runnable {

 

    // Objektvariablen

    int wait;

    Thread t;
public Counter(int wait) {

        this.wait = wait;

        t = new Thread(this);

    }

 

    // run-Methode ueberschreiben

    @Override

    public void run() {

        System.out.flush();

        System.out.print("Ich arbeite");

        for (int i = 0; i <= 100; i++) {

            System.out.print(".");

            try {

                Thread.sleep(wait);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }

 

    public void start() {

        t.start();

    }

}