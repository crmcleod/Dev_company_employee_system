import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jerome", "BC1234567f", 22000);
    }

    @Test
    public void hasName(){
        assertEquals("Jerome", databaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Shelagh");
        assertEquals("Shelagh", databaseAdmin.getName());
    }

    @Test
    public void cantChangeNameIfBlank(){
        databaseAdmin.setName("");
        assertEquals("Jerome", databaseAdmin.getName());
    }

    @Test
    public void cantChangeNameIfInvalidEntry(){
        databaseAdmin.setName(null);
        assertEquals("Jerome", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("BC1234567f", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(22000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(3000);
        assertEquals(25000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void wontRaiseSalaryIfNegativeIncrement(){
        databaseAdmin.raiseSalary(-100);
        assertEquals(22000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(220, databaseAdmin.payBonus(),0.1);
    }

}
