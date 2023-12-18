package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Contact;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.ContactDto;

public abstract class AbstractContactMapper {

    public ContactDto contactToContactDTO(Contact contact) {
        if(contact != null) {
            ContactDto contactDto = new ContactDto();
            contactDto.setEmail(contact.getEmail());
            contactDto.setPhone(contact.getPhone());
            return contactDto;
        }
        else {
            return null;
        }
    }
}