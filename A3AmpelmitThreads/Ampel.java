package A3AmpelmitThreads;



public class Ampel implements Runnable {
    int count = 1;
    Thread t;
    int wait;
    String Ampel;
    public static final int ROT = 1;
    public static final int ROTGELB = 2;
    public static final int GRÜN = 3;
    public static final int GELB = 4;

    public Ampel(String Name, int wait) {
        this.Ampel = Name;
        this.wait = wait;
        t = new Thread(this);
    }

    @Override
    public void run() {
        while (true) {

            switch (count) {
                // -------------------------------------------------------------------

                case 1:
                    count = 2;
                    System.out.println("Die Ampel " + Ampel + " ist Rot");
                    try {
                        Thread.sleep(wait);
                      } catch (InterruptedException e) {
                        e.printStackTrace();
                      }
                    
                    break;
                // -------------------------------------------------------------------
                case 2:
                    count = 3;
                    System.out.println("Die Ampel " + Ampel + " ist Rot Gelb");
                    try {
                        Thread.sleep(wait);
                      } catch (InterruptedException e) {
                        e.printStackTrace();
                      }
                    
                    break;
                // -------------------------------------------------------------------
                case 3:
                    count = 4;
                    System.out.println("Die Ampel " + Ampel + " ist Grün");
                    try {
                        Thread.sleep(wait);
                      } catch (InterruptedException e) {
                        e.printStackTrace();
                      }
                   
                    break;
                // -------------------------------------------------------------------
                case 4:
                    count = 1;
                    System.out.println("Die Ampel " + Ampel + " ist Gelb");
                    try {
                        Thread.sleep(wait);
                      } catch (InterruptedException e) {
                        e.printStackTrace();
                      }
                    
                    break;
                // -------------------------------------------------------------------
            }
        }
    }

    public void start() {
        t.start();
    }

}
