package Polymorphism;

public class main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2 , 3));
//        System.out.println(c.add(2 , 3 , 4));
//        System.out.println(c.add(2 , 3 , 6, 8.8  ));

        // runtime polymorphism
        Circle c = new Circle();
        c.draw();

        REct r = new REct();
        r.draw();
    }
    public static void doDrawingStuff(Shape s ){
        s.draw();
    }


}
