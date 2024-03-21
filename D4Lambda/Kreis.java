package D4Lambda;

public class Kreis {

    public static void main(String[] args) {

        IKreis kreis1 = r -> Math.PI * r * r;
        System.out.println(kreis1);
    }

    public interface IKreis {

        public double getArea(double radius);

    }

}
