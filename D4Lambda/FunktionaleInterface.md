# Funktionale Interfaces - Zusammenfassung
## Was sind funktionale Interfaces?
Unter funktionalen Interfaces versteht man, ein Interface welches nur eine einzige Methode besitzt. Mit einer Lamdba-Notation kann dieses Interface schnell implementiert werden.  

## Erstellen einer einfachen Funktion
````java
    Mathe mult = (a,b) -> a*b;

    System.out.println(mult.fkt(5,3));

    public interface Mathe {
        double fkt(double a, double b);
    }
````

## Funktion Interface
Bei einem Funktion Interface wird ein Wert mit apply() hinzugegeben und ein Wert nach einer Operation zurückgegeben. 

Hier muss zuerst die passende Bibliothek implementiert werden.
````java
import java.util.function.Function;
````

````java
Function<Integer, Integer> addTwo = number -> number +2; 
Function<Integer, Integer> multThree = number -> number *3;
````
Der Pfeil: -> ist hierbei die Lambda-Notation. Sie sagt sozusagen was in der Methode passiern soll. Hier wird einer Zahl entwerder 2 addiert oder sie wird mit 3 multipliziert. 

Wenn man nun die Methode ausführt, kann man eine Zahl übergeben, welche dann nach dem Schema der Methode abarbeitet wird. 

Bsp:
````java
System.out.println(addTwo.apply(3));
````
Hier wird dann der Wert 5 ausgegeben. Wenn man nun mehrere Interfaces verbinden möchte, gibt es verschiedene Möglichkeiten wie ''andThen'' oder ''compose''. 

Bsp:
````java
int result1 = addTwo.andThen(multThree).apply(4);// addTwo wird zuerst ausgeführt
int result2 = addTwo.compose(multThree).apply(4);// multThree wird zurest ausgeführt
````
Hier werden die Werte 18 und 14 ausgegeben. 

## Predicate Interfaces
Bei einem Predicate Interface wird ein Boolean-Wert übergeben, wenn die bedingungen stimmen. Dazu muss aber zuerst die Bibliothek implementiert werden:
````java
import java.util.function.Predicate;
````

Danch kann man mit dem Predicate zum Beispiel ene Liste auf einen bestimmten Wert überprüfen.
````java
List<String> students = List.of("Marc", "Lennard", "Simon", "Elias", "Niklas");
Predicate<String> studentTest = student -> student.startsWith("M");
boolean Test = students.stream().anyMatch(studentTest);

System.out.println("Gibt es einen Namen der mit M beginnt?: "+Test);
````
Hier wird dann true ausgegeben, da ein Wert in der Liste mit M beginnt.

## Consumer Interface
Bei einem Consumer Interface gibt es einen einzigen Input, aber keinen Output

Dazu muss aber zuerst die Bibliothek implementiert werden:
````java
import java.util.function.Consumer;
````

````java
List<String> students = List.of("Peter", "Paul", "Marie");
Consumer<String> swen = s -> System.out.println(s + "!");
swen.accept("Hallo");

students.forEach(swen);
````
## Supplier Interface
Bei einem Supplier Interface gibt, nach einer Operation ein Ergebnis aus. Es gibt hierbei keinen Input, sondern nur einen Output.

Auch hier muss erst die Bibliothek implementiert werden. 
````java
import java.util.function.Supplier;
````

````java
Supplier<Double> random1000 = () -> Math.random() * 1000;
System.out.println("Zufällige Zahl: " + random1000.get());
````
Es wird eine zufällige Zahl zwischen 0 und 1000 ausgegeben

