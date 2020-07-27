import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){ director = new Director("Penelope", "ZZ11111111Z", 200000, "Brooms", 3000000);}

    @Test
    public void hasName(){
        assertEquals("Penelope", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("ZZ11111111Z", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(200000, director.getSalary(),0.1);
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(1);
        assertEquals(200001, director.getSalary(), 0.1);
    }
    @Test
    public void canCalculateBonus(){
        assertEquals(2000, director.payBonus(),0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Brooms", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(3000000, director.getBudget(),0.1);
    }
}
