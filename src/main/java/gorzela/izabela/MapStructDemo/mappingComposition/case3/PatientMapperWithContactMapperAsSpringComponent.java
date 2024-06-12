package gorzela.izabela.MapStructDemo.mappingComposition.case3;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.Patient;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.PatientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses= ContactMapperAsSpringComponent.class)
public interface PatientMapperWithContactMapperAsSpringComponent {

    //Map a bean with child bean (bean with reference to other bean).
    //Mapping with invoking other mapper that is Spring component.

    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);
}