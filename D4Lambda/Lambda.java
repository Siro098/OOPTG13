package D4Lambda;

public class Lambda {
    
public static void main(String[] args) {
 
 Mathe addittion = (int a, int b) -> a + b;
 Mathe multiplikation = (int a, int b) -> a * b;
 Mathe subtraktion = (int a, int b) -> a - b;
 Mathe division = (int a, int b) -> a / b;

}



public interface Mathe {
int fkt(int a, int b);
    
}

}
