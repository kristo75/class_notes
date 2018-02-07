import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void Before(){
        developer = new Developer("Linda", "NY6767676B", 29000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Linda", developer.getName());
    }
}
