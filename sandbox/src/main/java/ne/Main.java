package ne;

public class Main {
    public static void main(String[] args) {
        hello("world");
        hello("a");
        hello("b");
        Square s = new Square(5);
      System.out.println("Пл =" + area(s));

        Rectangle r = new Rectangle (4,6);
      System.out.println(area (r));
    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + " !" );
    }

    public static double area(Square s) {
        return s.l*s.l;
    }

    public static double area (Rectangle r){
        return r.a* r.b;
    }
}