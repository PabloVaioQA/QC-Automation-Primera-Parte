
import Entidades.Electrodoméstico;
import Entidades.Lavadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vaiop
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void comprobarColor(){
        Lavadora l1 = new Lavadora(35, 1000d, 50, "gris", 'd');
        
        assertEquals("gris",l1.getColor());
    }
    
    @Test
    public void comprobarColor2(){
        Electrodoméstico l1 = new Lavadora(35, 1000d, 50, "verde", 'd');
        
        assertEquals("blanco",l1.getColor());
    }
}
