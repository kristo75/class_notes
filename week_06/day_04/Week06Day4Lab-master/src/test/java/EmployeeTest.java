import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;


    @Before
    public void Before(){
        employee = new Employee("Trevor", "NY4747474A", 34000.00);

    }

    @Test
    public void hasName(){
        assertEquals("Trevor", employee.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("NY4747474A", employee.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(34000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(1000.00);
        assertEquals(35000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(340.00, employee.payBonus(), 0.01);
    }

    @Test
    public void canSetName(){
        employee.setName("Sam");
        assertEquals("Sam", employee.getName());
    }

}
