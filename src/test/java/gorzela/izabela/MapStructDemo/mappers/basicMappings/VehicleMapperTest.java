package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case9.Vehicle;
import gorzela.izabela.MapStructDemo.basicMappings.case9.VehicleDto;
import gorzela.izabela.MapStructDemo.basicMappings.case9.VehicleMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleMapperTest {

    @Test
    void shouldMapVehicleToVehicleDto() {

        Vehicle vehicle = new Vehicle();
        vehicle.setPoveredBy("current");
        vehicle.setMileage(13000L);

        VehicleDto vehicleDto = VehicleMapper.INSTANCE.vehicleToVehicleDto(vehicle);

        assertEquals(vehicle.getPoveredBy(), vehicleDto.getPoveredBy());
        assertEquals(vehicle.getMileage() * 2, vehicleDto.getMileage());
    }
}