package Vehicle;
public class PrintVehicleNames {

    Vehicle[] vehicles;

    public PrintVehicleNames(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public String execute() {
        String listOfBrands = "";
        for (int pointer = 0 ; pointer < vehicles.length ; pointer++) {
            Vehicle getBrands = vehicles[pointer];
            if (pointer< vehicles.length -1){
                listOfBrands = listOfBrands + getBrands.getBrand() + "-";
            } else {
                listOfBrands = listOfBrands + getBrands.getBrand();

            }

        }
        return listOfBrands;
    }
}