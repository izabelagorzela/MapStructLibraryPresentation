package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case1.b.Car;
import gorzela.izabela.MapStructDemo.basicMappings.case1.b.CarDto;
import gorzela.izabela.MapStructDemo.basicMappings.case1.b.Color;
import gorzela.izabela.MapStructDemo.basicMappings.case1.b.CarMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMapperTest {

    @Test
    void shouldMapCarToCarDto() {

        Car car = new Car();
        car.setMake("BMW");
        car.setColor(Color.GREEN);

        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        assertEquals(car.getMake(), carDto.getMake());
        assertEquals(car.getColor().name(), carDto.getColor());
    }

    @Test
    void shouldMapCarDtoToCar() {

        CarDto carDto = new CarDto();
        carDto.setMake("BMW");
        carDto.setColor("GREEN");

        Car car = CarMapper.INSTANCE.carDtoToCar(carDto);

        assertEquals(carDto.getMake(), car.getMake());
        assertEquals(Color.valueOf(carDto.getColor()), car.getColor());
    }
}