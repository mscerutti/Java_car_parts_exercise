/**
 * Created by localadmin on 1/20/17.
 */
public class FanBlade extends CoolingSystemPart {
    Integer numberOfBlades;
    Integer diameterInCentimeters;

    public FanBlade(String manufacturer, String partNumber, String description, Integer numberOfBlades, Integer diameterInCentimeters) {
        super(manufacturer, partNumber, description);
        this.numberOfBlades = numberOfBlades;
        this.diameterInCentimeters = diameterInCentimeters;
    }
    String fullDescription()  throws IllegalAccessException{

        return String.format("manufacturer: %1s, partNumber: %2s, description: %3s, numberOfBlades: %4$1d, diameterInCentimeters: %5$1d",
                manufacturer,
                partNumber,
                description,
                numberOfBlades,
                diameterInCentimeters);

    }

}
