package A1ThreadsVererbung;

public class MyThread extends Thread {

  int wait;
  String Name;

  public MyThread(String Name, int wait) {

    this.wait = wait;
    this.Name = Name;
  }

  @Override
  public void run() {

    for (int i = 0; i <= wait; i++) {
      System.out.println(Name + ":" + i);

      try {
        Thread.sleep(wait);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

}