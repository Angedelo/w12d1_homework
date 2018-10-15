import Staff.Employee;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Employee employee;
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "AB12345C", 30000.00, "Accounting");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounting", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000.00);
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus(), 0.01);
    }

}
