import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class EnginePartTest {
    EnginePart enginePart;

    String manufacturer = "Nissan Automotives";
    String partNumber = "123456789";
    String description = "lorem ipsum lorem has a ipsum of upsum amounts";

    @Before
    public void setUp(){
        enginePart = new EnginePart(manufacturer, partNumber, description);
    }

    @Test
    public void coolingSystemComponent(){
        assertFalse(enginePart.coolingSystemComponent());
    }

    @Test
    public void engineComponent(){
        assertTrue(enginePart.engineComponent());
    }
}