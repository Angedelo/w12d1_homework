import Staff.Employee;
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    Employee employee;
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Frank", "OJ96735W", 25000.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }
}
