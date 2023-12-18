package gorzela.izabela.MapStructDemo.entities.mappingComposition;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Patient {

    private String surname;
    private Contact contact;
}