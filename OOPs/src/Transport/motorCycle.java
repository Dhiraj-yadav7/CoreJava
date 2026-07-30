package Transport;

public class motorCycle extends Vechile {

    public String handleBarStyle;
     public  String SuspensionType;

     motorCycle(String name , String model, int noOfTyers, String handleBarStyle , String SuspensionType){
         super(name, model, noOfTyers);
         this.handleBarStyle = handleBarStyle;
         this.SuspensionType = SuspensionType;
     }

     public void wheelie(){
         System.out.println("motorcycle is doing wheelie!"+ name);
     }

}
