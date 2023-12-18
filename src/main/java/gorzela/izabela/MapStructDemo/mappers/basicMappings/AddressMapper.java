package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Address;
import gorzela.izabela.MapStructDemo.entities.basicMappings.DeliveryAddressDto;
import gorzela.izabela.MapStructDemo.entities.basicMappings.Person;
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