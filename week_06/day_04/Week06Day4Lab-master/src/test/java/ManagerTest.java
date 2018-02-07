import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void Before(){
        manager = new Manager("Cyrilina", "NY5656565A", 56000.00, "Honchos");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Honchos", manager.getDeptName());
    }
}
