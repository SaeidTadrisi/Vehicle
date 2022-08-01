package Vehicle;

public class Ship extends Vehicle {

    String brand;

    public Ship (String brand){
        this.brand = brand;
    }

    public boolean isMoving() {
        return true;
    }

    public String getBrand() {
        return brand;
    }

}
