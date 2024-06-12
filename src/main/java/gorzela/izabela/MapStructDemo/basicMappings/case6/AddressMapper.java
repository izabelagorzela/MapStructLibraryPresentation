package gorzela.izabela.MapStructDemo.basicMappings.case6;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    //Mapping methods with several parameters.
    //Retrieving parameters from two entities.

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(source = "address.street", target = "street")
    @Mapping(source = "person.surname", target = "customerSurname")
    DeliveryAddressDto personAndAddressMapToDeliveryAddressDto(Person person, Address address);
}