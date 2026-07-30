package Transport;

public class car extends Vechile {
    public int noOfDoors;
    public String transmissionType;

    car( String name, String model, int noOfTypes, int noOfDoors , String transmissionType){

        super(name, model, noOfTypes);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

    }
    public void startAc(){
        System.out.println("Ac started of "+ name);

    }


}
