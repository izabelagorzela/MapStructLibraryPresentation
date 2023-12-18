package gorzela.izabela.MapStructDemo.entities.mappingComposition;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientDto {

    private String surname;
    private ContactDto contactDto;
}