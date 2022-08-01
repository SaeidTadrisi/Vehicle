package Vehicle;

public class MotorCycle extends Vehicle{

    String brand;

    public MotorCycle ( String brand){
        this.brand = brand;
    }


    public boolean isMoving(){
        if (safety && start){
            return true;
        }else
            return false;
    }

    public String getBrand() {
        return brand;
    }

}
