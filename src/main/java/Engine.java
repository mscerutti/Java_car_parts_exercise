
/**
 * Created by localadmin on 1/20/17.
 */
public class Engine extends EnginePart {
    Integer displacement;
    String compressionRatio;
    String fuelType;

    public Engine(String manufacturer, String partNumber, String description,Integer displacement, String compressionRatio, String fuelType){
        super(manufacturer, partNumber, description);
        this.displacement = displacement;
        this.compressionRatio = compressionRatio;
        this.fuelType = fuelType;
    }

    String fullDescription() throws IllegalAccessException{

        return String.format("%s, displacement: %d ci, compressionRatio: %s, fuelType: %s",
                super.fullDescription(),
                displacement,
                compressionRatio,
                fuelType);

    }

}
