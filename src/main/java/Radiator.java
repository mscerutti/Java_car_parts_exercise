/**
 * Created by localadmin on 1/20/17.
 */
public class Radiator  extends CoolingSystemPart {
    Integer coolantPressure;

    public Radiator(String manufacturer, String partNumber, String description, Integer coolantPressure) {
        super(manufacturer, partNumber, description);
        this.coolantPressure = coolantPressure;
    }
    String fullDescription()  throws IllegalAccessException{

        return String.format("%1s, coolantPressure: %2s psi",
                super.fullDescription(),
                coolantPressure);
    }

}
