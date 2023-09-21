package A3AmpelmitThreads;

public class starteAmpel {

    public static void main(String[] args) {

        Ampel a = new Ampel("a", 1000);
        Ampel b = new Ampel("b", 2000);


        a.start();
        b.start();

    }
}