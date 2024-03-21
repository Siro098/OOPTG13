package D4Lambda;

public class Lambda {
    
public static void main(String[] args) {
 
 Mathe addittion = (int a, int b) -> a + b;
 Mathe multiplikation = (int a, int b) -> a * b;
 Mathe subtraktion = (int a, int b) -> a - b;
 Mathe division = (int a, int b) -> a / b;

System.out.println(addittion);
System.out.println(multiplikation);
System.out.println(subtraktion);
System.out.println(division);

}



public interface Mathe {
int fkt(int a, int b);
    
}

}
