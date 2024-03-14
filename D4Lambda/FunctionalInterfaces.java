package D4Lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaces {
  
    public static void main(String[] args) {
        //funktions
        Function<Integer, Integer> addTwo = number -> number + 2; // number +2
        Function<Integer, Integer> TimesThree = number -> number * 3;
    
    System.out.println(addTwo.andThen(TimesThree.andThen(addTwo)).apply(5)); //+2 dann mal 3 und dann +2
    
//Consumer
List<String> students = List.of("Lennard", "Florian","Elias","Niklas");
Consumer<String> swem = s -> System.out.println(s + "!");
swem.accept("Hallo");

students.forEach(swem);

    }

public static void soutWithEm(String s){



}


}
