package gorzela.izabela.MapStructDemo.mappingComposition.shared;

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