import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class FanBladeTest {
    FanBlade fanBlade;
    String manufacturer = "Fans of Blading";
    String partNumber = "0101010101";
    String description = "Fans that will Blade through your car";
    Integer numberOfBlades = 4;
    Integer diameterInCentimeters = 30;

    @Before
    public void setUp(){
        fanBlade = new FanBlade(manufacturer, partNumber, description, numberOfBlades, diameterInCentimeters);
    }
    @Test
    public void canConstructFanBlade(){

        assertEquals(manufacturer, fanBlade.manufacturer);
        assertEquals(partNumber, fanBlade.partNumber);
        assertEquals(description, fanBlade.description);
        assertEquals(numberOfBlades, fanBlade.numberOfBlades);
        assertEquals(diameterInCentimeters, fanBlade.diameterInCentimeters);

    }
    @Test
    public void fullDescription() throws IllegalAccessException{

        assertEquals("manufacturer: Fans of Blading, partNumber: 0101010101, description: Fans that will Blade through your car, numberOfBlades: 4, diameterInCentimeters: 30", fanBlade.fullDescription());
    }

    @Test
    public void coolingSystemComponent(){
        assertTrue(fanBlade.coolingSystemComponent());
    }

    @Test
    public void engineComponent(){
        assertFalse(fanBlade.engineComponent());
    }

}