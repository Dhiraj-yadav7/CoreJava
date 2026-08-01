
               // Abstraction Class


//package AbstractDesign;
//
//abstract class bird{
//     abstract void fly();
//     abstract void eat();
//
//}
//
//class sparrow extends bird {
//
//    void fly() {
//        System.out.println("sparrow is flying ");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("sparrow is eating ");
//    }
//}
//    class Crow extends bird {
//
//        void fly() {
//            System.out.println("Crow is flying ");
//        }
//
//        @Override
//        void eat() {
//            System.out.println("Crow is eating ");
//        }
//    }
//public class main {
//    public static void doBirdStuff(bird b){
//        b.eat();
//        b.fly();
//    }
//    public static void main(String[] args) {
//       doBirdStuff(new sparrow());
//       doBirdStuff(new Crow());
//
//    }
//}




                               // Interface




package AbstractDesign;

interface Bird {
    void fly();
    void eat();

}

class sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow is Flying ");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is Eating ");
    }
}
class Crow implements Bird {

   public  void fly() {
        System.out.println("Crow is flying ");
    }

    @Override
   public  void eat() {
        System.out.println("Crow is eating ");
    }
}
public class main {
    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
    }
    public static void main(String[] args) {
        doBirdStuff(new sparrow());
        doBirdStuff(new Crow());

    }
}

