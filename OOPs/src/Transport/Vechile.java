package Transport;

public class Vechile {
     public String name ;
     public String model ;
     public int noOfTyre ;

      public Vechile(){
         this.name= "";
         this.model ="";
         this.noOfTyre= -1;

     }

     Vechile(String name, String model,int noOfTyre){
         this.name= name ;
         this.model= model;
         this.noOfTyre = noOfTyre;

     }
     void startEngine(){
         System.out.printf("Engine is starting of %s : %s\n", name, model);


     }

     void stopEngine(){
         System.out.printf("Engine is stopping of %s : %s\n", name, model);

     }
}
