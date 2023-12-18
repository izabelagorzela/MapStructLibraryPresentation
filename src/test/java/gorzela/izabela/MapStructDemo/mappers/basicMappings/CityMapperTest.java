package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.CityDto;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityMapperTest {

    @Test
    void shouldMapCityMapToCityDto() {

        Map<String, String> cityMap = new HashMap<>();
        cityMap.put("nameOfCity", "Gdansk");
        cityMap.put("zipCode", "80-462");
        cityMap.put("residentsNumber", "123000");

        CityDto cityDto = CityMapper.INSTANCE.cityMapToCityDto(cityMap);

        assertEquals( cityMap.get("nameOfCity"), cityDto.getCityName());
        assertEquals(cityMap.get("zipCode"), cityDto.getPostcode());
        assertEquals(Long.parseLong(cityMap.get("residentsNumber")), cityDto.getResidentsNumber());
    }
}