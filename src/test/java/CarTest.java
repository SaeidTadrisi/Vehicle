import Vehicle.Car;
import Vehicle.Vehicle;

import com.sun.corba.se.impl.io.ValueHandlerImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void car_test() {

        Vehicle bmw = new Car("BMW");
        bmw.vehicleIsSafe();
        bmw.vehicleIsTurnedOn();
        boolean bmwMoving = bmw.isMoving();
        Assertions.assertTrue(bmwMoving);
    }

    @Test
    void car_test_2() {
        Vehicle benz = new Car("Benz", "Automatic", 120);

        benz.vehicleIsTurnedOn();
        benz.vehicleIsSafe();
        boolean benzMoving = benz.isMoving();

        Assertions.assertTrue(benzMoving);

        }
}
