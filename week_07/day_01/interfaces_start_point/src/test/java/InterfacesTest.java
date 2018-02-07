import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesTest {

    Printer printer;

    @Before
    public void before() {

        printer = new Printer();
    }

    @Test
    public void printerCanConnect(){
        assertEquals("connected", printer.connect());
    }

    @Test
    public void mouseCanConnect(){
        Mouse mouse = new Mouse();
        assertEquals("Mouse connected", mouse.connect());
    }

    @Test
    public void printerCanPrint(){
        assertEquals("I'm printing", printer.print("I'm printing"));
    }

    @Test
    public void canConnectAsPeripheral(){
        IPeripheral device = new Printer();
        assertEquals("connected", device.connect());
    }
}
