import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * Created by localadmin on 1/20/17.
 */
public class EngineTest {
    Engine engine;

    String manufacturer = "Nissan Automotives";
    String partNumber = "123456789";
    String description = "lorem ipsum lorem has a ipsum of upsum amounts";
    Integer displacement = 450;
    String compressionRatio = "1000: 100";
    String fuelType = "DieselEngine";

    @Before
    public void setUp(){
        engine = new Engine(manufacturer, partNumber, description, displacement, compressionRatio, fuelType);
    }

    @Test
    public void  engineComponents(){
        assertEquals("Nissan Automotives", engine.manufacturer);
        assertEquals("123456789", engine.partNumber);
        assertEquals("lorem ipsum lorem has a ipsum of upsum amounts", engine.description);
        assertEquals((Integer)450, engine.displacement);
        assertEquals("1000: 100", engine.compressionRatio);
        assertEquals("DieselEngine", engine.fuelType);
    }

    @Test
    public void fullDescription() throws IllegalAccessException{

        assertEquals("manufacturer: Nissan Automotives, partNumber: 123456789, description: lorem ipsum lorem has a ipsum of upsum amounts, displacement: 450 ci, compressionRatio: 1000: 100, fuelType: DieselEngine", engine.fullDescription());
    }

    @Test
    public void coolingSystemComponent(){
        assertFalse(engine.coolingSystemComponent());
    }

    @Test
    public void engineComponent(){
        assertTrue(engine.engineComponent());
    }
}