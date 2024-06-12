package gorzela.izabela.MapStructDemo.basicMappings.case1.b;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    //The annotations is unnecessary when properties types are different. The MapStruct will make implicit type conversion.

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDto carToCarDto(Car car);
    Car carDtoToCar(CarDto carDto);
}