import Vehicle.MotorCycle;
import Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorCycleTest {
    @Test
    void MotorCycle_Test() {
        Vehicle rex = new MotorCycle("REX");

        rex.vehicleIsSafe();
        rex.vehicleIsTurnedOn();
        boolean rexMoving = rex.isMoving();

        Assertions.assertTrue(rexMoving);
    }
}
