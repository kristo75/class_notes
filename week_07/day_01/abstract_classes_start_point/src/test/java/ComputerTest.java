import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    DesktopComputer desktop;
    LaptopComputer laptop;

    @Before
    public void before() {

        desktop = new DesktopComputer();
        laptop = new LaptopComputer();
    }

    @Test
    public void desktopCanRunApplication(){
        assertEquals("IntelliJ Status: I am running IntelliJ", desktop.runApplication("IntelliJ"));
    }
    @Test
    public void laptopCanRunApplication(){
        assertEquals("IntelliJ Status: Program IntelliJ is running", laptop.runApplication("IntelliJ"));
    }

    @Test
    public void desktopCanCloseApplication(){
        assertEquals("I am closing down CC Caraoke", desktop.closeApplication("CC Caraoke"));
    }

    @Test
    public void laptopCanCloseApplication(){
        assertEquals("Program CC Caraoke is closing down", laptop.closeApplication("CC Caraoke"));
    }

    @Test
    public void desktopCanShutDown() {
        assertEquals("Shutting down", desktop.shutDown());
    }

    @Test
        public void laptopCanShutDown(){
            assertEquals("Shutting down", laptop.shutDown());
        }

//    @Test
//    public void desktopCanShutDown() {
//        Computer computer = new DesktopComputer();
//        assertEquals("Shutting down", computer.shutDown());
//    }

//    @Test
//    public void laptopCanShutDown(){
//        Computer computer = new LaptopComputer();
//        assertEquals("Shutting down", computer.shutDown());
//    }
//
//    void printDetails(Computer computer){
//        computer.printDetails();
//    }
    }