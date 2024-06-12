package gorzela.izabela.MapStructDemo.basicMappings.case1.c;

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