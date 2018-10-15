import Staff.Employee;
import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Employee employee;
    Director director;

    @Before
    public void before(){
        director = new Director("Alan", "FG647392T", 45000.00, "HR");
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(450, director.payBonus(), 0.01);
    }
}
