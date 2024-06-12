package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.Contact;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.ContactDto;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.AbstractContactMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AbstractContactMapperTest {

    private AbstractContactMapperImpl abstractContactMapperImpl;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        this.abstractContactMapperImpl = new AbstractContactMapperImpl();
        this.contact = new Contact("diane@wp.pl", "984321765");
    }

    @Test
    void shouldMapContactToContactDto() {

        ContactDto contactDto = abstractContactMapperImpl.contactToContactDTO(contact);

        assertEquals(contact.getEmail(), contactDto.getEmail());
        assertEquals(contact.getPhone(), contactDto.getPhone());
    }

    @Test
    void shouldMapNullToNull() {

        ContactDto contactDto = abstractContactMapperImpl.contactToContactDTO(null);

        assertNull(contactDto);
    }

    public class AbstractContactMapperImpl extends AbstractContactMapper {

    }
}