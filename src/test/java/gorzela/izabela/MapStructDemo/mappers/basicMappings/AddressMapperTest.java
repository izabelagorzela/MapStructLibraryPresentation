package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case6.Address;
import gorzela.izabela.MapStructDemo.basicMappings.case6.AddressMapper;
import gorzela.izabela.MapStructDemo.basicMappings.case6.DeliveryAddressDto;
import gorzela.izabela.MapStructDemo.basicMappings.case6.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressMapperTest {

    @Test
    public void shouldMapPersonAndAddressToDeliveryAddressDto() {

        Person person = new Person();
        person.setSurname("Schmit");

        Address address = new Address();
        address.setStreet("Dluga");

        DeliveryAddressDto deliveryAddressDtoDto = AddressMapper.INSTANCE.personAndAddressMapToDeliveryAddressDto(person, address);

        assertEquals(person.getSurname(), deliveryAddressDtoDto.getCustomerSurname());
        assertEquals(address.getStreet(), deliveryAddressDtoDto.getStreet());

    }
}