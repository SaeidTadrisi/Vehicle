package Vehicle;

public class Car extends Vehicle implements GearBox, Trunk {

    boolean doors;
    String brand;
    String gearBoxType;
    long trunkValue;
    String driver;


    public Car (String brand){
        this.brand = brand;
    }

    public void doorsAreOpen(){
        doors = true;
    }

    public void doorsAreClosed(){
        doors = false;
    }

    public boolean isMoving(){
        if (safety && start && !doors){
            return true;
        }else
            return false;
    }

    public String getBrand() {
        return brand;
    }

    public String gearBoxType() {
        return null;
    }

    public int trunkValue() {
        return 0;
    }

    public Car (String brand, String gearBoxType, long trunkValue){
        this.brand = brand;
        this.gearBoxType = gearBoxType;
        this.trunkValue = trunkValue;
    }
}
