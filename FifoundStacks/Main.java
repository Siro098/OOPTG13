package FifoundStacks;

public class Main {
    public static void main(String[] args) {
        Fifo q = new Fifo();

        q.push("Florian");
        q.push("Simon");
        q.push("Dylan");
        q.push("Niklas");
        q.push("Sebastion");
       

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
