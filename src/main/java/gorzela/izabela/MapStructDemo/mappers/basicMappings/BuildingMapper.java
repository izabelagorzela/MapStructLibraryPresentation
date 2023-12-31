package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Building;
import gorzela.izabela.MapStructDemo.entities.basicMappings.BuildingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BuildingMapper {

    //Mapping  with constant.

    BuildingMapper INSTANCE = Mappers.getMapper(BuildingMapper.class);
    @Mapping(target = "numberOfGarages",
            constant = "140")
    BuildingDto buildingToBuildingDto(Building building);
}