import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class RadiatorTest {
    Radiator radiator;
    String manufacturer = "Rad-Iators";
    String partNumber = "8457";
    String description = "Super Cool Radiator";
    Integer coolantPressure = 103;

    @Before
    public void setUp(){
        radiator = new Radiator(manufacturer, partNumber, description, coolantPressure);
    }

    @Test
    public void canConstructRadiator(){
        assertEquals(manufacturer, radiator.manufacturer);
        assertEquals(partNumber, radiator.partNumber);
        assertEquals(description, radiator.description);
        assertEquals(coolantPressure, radiator.coolantPressure);
    }
    @Test
    public void fullDescription() throws IllegalAccessException{

        assertEquals("manufacturer: Rad-Iators, partNumber: 8457, description: Super Cool Radiator, coolantPressure: 103 psi", radiator.fullDescription());
    }

    @Test
    public void coolingSystemComponent(){
        assertTrue(radiator.coolingSystemComponent());
    }

    @Test
    public void engineComponent(){
        assertFalse(radiator.engineComponent());
    }
}