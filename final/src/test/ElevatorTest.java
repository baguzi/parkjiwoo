import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevatorTest {

    @Test
    public void testCheckPeopleStatus() {
        Elevator elevator = new Elevator(10);

        elevator.setPeople(5);
        assertEquals("엘리베이터를 이용하셔도 됩니다.", elevator.checkPeopleStatus());

        elevator.setPeople(9);
        assertEquals("약간 혼잡합니다. 급하면 계단을 이용해주세요", elevator.checkPeopleStatus());

        elevator.setPeople(10);
        assertEquals("계단을 이용해 주세요", elevator.checkPeopleStatus());
    }
}