package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.CityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Map;

@Mapper
public interface CityMapper {

    //Mapping from map to bean.

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(source = "nameOfCity", target = "cityName")
    @Mapping(source = "zipCode", target = "postcode")
    CityDto cityMapToCityDto(Map<String, String> cityMap);
}