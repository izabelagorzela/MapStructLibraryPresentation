package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Car;
import gorzela.izabela.MapStructDemo.entities.basicMappings.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    //The annotations is unnecessary when properties types are different. The MupStruct will make implicit type conversion.

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDto carToCarDto(Car car);
    Car carDtoToCar(CarDto carDto);
}