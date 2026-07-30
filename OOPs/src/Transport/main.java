package Transport;

public class main {
    public static void main(String[] args) {
        car c= new car ( "maruti", "800", 4, 5, "auto");
        c.startEngine();
        c.startAc();
        c.stopEngine();

        motorCycle m = new motorCycle("splendor", "xline", 2, "U", "soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();

    }
}
