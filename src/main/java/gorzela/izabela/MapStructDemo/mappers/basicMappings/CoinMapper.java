package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Coin;
import gorzela.izabela.MapStructDemo.entities.basicMappings.CoinDto;
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