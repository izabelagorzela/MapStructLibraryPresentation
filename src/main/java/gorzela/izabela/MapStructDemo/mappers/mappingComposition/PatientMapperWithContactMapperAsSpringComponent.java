package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Patient;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.PatientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses= ContactMapperAsSpringComponent.class)
public interface PatientMapperWithContactMapperAsSpringComponent {

    //Map a bean with child bean (bean with reference to other bean).
    //Mapping with invoking other mapper that is Spring component.

    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);
}