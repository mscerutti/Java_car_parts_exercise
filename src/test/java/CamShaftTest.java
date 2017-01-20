import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CamShaftTest {
    CamShaft camShaft;
    String manufacturer = "CamShafters";
    String partNumber = "0101010";
    String description = "Fans that will Blade through your car";
    Integer duration = 4;
    Integer lift = 30;
    Integer timing = 250;

    @Before
    public void setUp(){
        camShaft = new CamShaft(manufacturer, partNumber, description, duration, lift, timing);
    }
    @Test
    public void canConstructCamShaft(){
        assertEquals(manufacturer, camShaft.manufacturer);
        assertEquals(partNumber, camShaft.partNumber);
        assertEquals(description, camShaft.description);
        assertEquals(duration, camShaft.duration);
        assertEquals(lift, camShaft.lift);
        assertEquals(timing, camShaft.timing);

    }
    @Test
    public void fullDescription() throws IllegalAccessException{

        assertEquals("manufacturer: CamShafters, partNumber: 0101010, description: Fans that will Blade through your car, duration: 4, lift: 30, timing: 250", camShaft.fullDescription());
    }

    @Test
    public void coolingSystemComponent(){
        assertFalse(camShaft.coolingSystemComponent());
    }

    @Test
    public void engineComponent(){
        assertTrue(camShaft.engineComponent());
    }

}