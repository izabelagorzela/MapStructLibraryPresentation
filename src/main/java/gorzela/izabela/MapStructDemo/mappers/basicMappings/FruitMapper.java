package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Fruit;
import gorzela.izabela.MapStructDemo.entities.basicMappings.FruitDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FruitMapper {

    //Annotations are unnecessary when properties name are the same.

    FruitMapper INSTANCE = Mappers.getMapper(FruitMapper.class);
    FruitDto fruitToFruitDto(Fruit fruit);
}