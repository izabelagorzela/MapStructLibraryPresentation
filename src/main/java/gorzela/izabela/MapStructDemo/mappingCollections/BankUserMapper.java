package gorzela.izabela.MapStructDemo.mappingCollections;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankUserMapper {

    //Mapping lists and maps.
    //Mapping when more than one property name is different.

    BankUserMapper INSTANCE = Mappers.getMapper(BankUserMapper.class);

    @Mapping(source="phoneNumbers", target="numbersOfPhone")
    @Mapping(source="balance", target="bankAccount")
    BankUserDto bankUserToBankUserDto( BankUser BankUser);
}