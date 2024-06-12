package gorzela.izabela.MapStructDemo.basicMappings.case4;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CoinMapper {

    //Mapping with excluding source property

    CoinMapper INSTANCE = Mappers.getMapper(CoinMapper.class);

    @Mapping(target = "value", ignore = true)
    CoinDto coinToCoinDto(Coin coin);
}