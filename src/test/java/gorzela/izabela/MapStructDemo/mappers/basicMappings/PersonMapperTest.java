package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Person;
import gorzela.izabela.MapStructDemo.entities.basicMappings.PersonDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonMapperTest {

    @Test
    public void shouldMapPersonToPersonDto() {

        Person person = new Person();
        person.setId(1);

        PersonDto personDto = PersonMapper.INSTANCE.personToPersonDto(person);

        assertNull(person.getSurname(), "Surname should be null");
        assertNotNull(personDto.getSurname());
        assertEquals(person.getId(), personDto.getUserIdentifier());
    }
}