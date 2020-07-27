import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Craig", "JM112233A", 100000, "Seasonal Socks");}

    @Test
    public void hasName(){
        assertEquals("Craig", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JM112233A", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Seasonal Socks", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(110000, manager.getSalary(),0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000, manager.payBonus(), 0.1);
    }


}
