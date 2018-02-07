import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void Before(){
        databaseAdmin = new DatabaseAdmin("Linus", "NY6767676A", 18000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Linus", databaseAdmin.getName());
    }
}
