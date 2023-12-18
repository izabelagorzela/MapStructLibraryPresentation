package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Vehicle;
import gorzela.izabela.MapStructDemo.entities.basicMappings.VehicleDto;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class VehicleMapper {

    //Mapping customization with after-mapping method.

    @AfterMapping
    public void changeMileage(@MappingTarget VehicleDto vehicleDto) {
        vehicleDto.setMileage(vehicleDto.getMileage() * 2);
    }

    public static VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);
    public abstract VehicleDto vehicleToVehicleDto(Vehicle vehicle);
}