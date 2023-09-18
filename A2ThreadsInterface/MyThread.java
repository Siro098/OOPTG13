package A2ThreadsInterface;

public class MyThread implements Runnable{

String Name;
int wait;
Thread t;

public MyThread(String Name, int wait){
this.Name = Name;
this.wait = wait;
t= new Thread(this);
}

@Override
public void run() {

}


public void start()

{

t.run();

}

}