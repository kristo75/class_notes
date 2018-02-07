import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void Before(){
        director = new Director("Big Boss", "NY9999999A", 890000.00, "Head Office", 1230000000.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(1230000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void hasDoubleBonus(){
        assertEquals(17800.00, director.payBonus(), 0.01);
    }
}
