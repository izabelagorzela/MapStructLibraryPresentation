package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Building;
import gorzela.izabela.MapStructDemo.entities.basicMappings.BuildingDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildingMapperTest {

    @Test
    void shouldMapBuildingToBuildingDto() {

        Building building = new Building();
        building.setNumberOfFloors(20);
        building.setNumberOfGarages(250);

        BuildingDto buildingDto = BuildingMapper.INSTANCE.buildingToBuildingDto(building);

        assertEquals(building.getNumberOfFloors(), buildingDto.getNumberOfFloors());
        assertEquals(140, buildingDto.getNumberOfGarages());
    }
}