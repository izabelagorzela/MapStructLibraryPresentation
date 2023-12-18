package gorzela.izabela.MapStructDemo.entities.basicMappings;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CityDto {

    private String cityName;
    private String postcode;
    private Long residentsNumber;
}