import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Graham", "AB09876543a", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Graham", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AB09876543a", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(),0.1);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(10000);
        assertEquals(40000, developer.getSalary(),0.1);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(300, developer.payBonus(), 0.1);
    }

}
