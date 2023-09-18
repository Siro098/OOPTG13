# Thread erzeugen
 ## Aufgabe
1. Erzeugen sie die Java Dateien 
`ErzeugeThreads.java` und `MeinThread.java`.

2. Fügen sie eine Main Methode in die Klasse `erzeugeThread`.

````java
public class erzeugeThreads {

    public static void main(String[] args){

        
       
   
    }
}
````

3. Die Klasse MainThread soll von der Klasse `Thread` erben.
````java
public class MyThread extends Thread{}

````


4. Jeder Thread hat einen Namen und zählt von 1 bis 100 und gibt diese Werte auf der Konsole aus. 
    Erweitern sie die Thread Klasse und testen sie 2 Threads mit 30 und 100 ms Wartezeit.
````java

public class erzeugeThreads {

    public static void main(String[] args){

        System.out.println("Erzeuge Thread gestartet");

        //Thread Objekt erstellen
        MyThread a = new MyThread("a", 100);
        MyThread b = new MyThread("b", 30);
       
        //Thread starten
        a.start();
        b.start();
       
    System.out.println("Main Thread zu ende");
    }



}

````
5. Beim Erzeugen des Threads soll die Wartezeit und der Name fesgelegt sein. ->Konstruktor mit Übergabeparametern.

````java
public MyThread(String Name ,int wait){

this.wait=wait;
this.Name=Name;
}

``````

6. Zeigen sie das der Main Thread vor den Zählthreads zuende ist obwohl er zuerst gestartet wird.