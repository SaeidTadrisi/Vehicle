import Vehicle.Vehicle;
import Vehicle.Car;
import Vehicle.MotorCycle;
import Vehicle.Ship;
import Vehicle.PrintVehicleNames;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintVehicleNamesTest {
    @Test
    void PrintBrands() {
        Vehicle benz = new Car("Benz", "Manual", 150);
        Vehicle bmw = new Car("BMW", "Automatic", 100);
        Vehicle rex = new MotorCycle("Rex");
        Vehicle cruise = new Ship("Cruise");

        Vehicle [] vehicles = {benz,bmw,rex,cruise};

        PrintVehicleNames printVehicleNames = new PrintVehicleNames(vehicles);

        String listOfBrands = printVehicleNames.execute();

        Assertions.assertEquals("Benz-BMW-Rex-Cruise" , listOfBrands);
        System.out.println(listOfBrands);
    }



    }

