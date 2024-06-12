package gorzela.izabela.MapStructDemo.mappingComposition.shared;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientDto {

    private String surname;
    private ContactDto contactDto;
}