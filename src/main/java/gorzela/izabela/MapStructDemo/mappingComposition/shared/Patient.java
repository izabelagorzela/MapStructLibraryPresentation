package gorzela.izabela.MapStructDemo.mappingComposition.shared;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Patient {

    private String surname;
    private Contact contact;
}