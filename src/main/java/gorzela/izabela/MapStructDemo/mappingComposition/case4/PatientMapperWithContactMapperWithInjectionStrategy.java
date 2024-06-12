package gorzela.izabela.MapStructDemo.mappingComposition.case4;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.Patient;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.PatientDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses= ContactMapperWithInjectionStrategy.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PatientMapperWithContactMapperWithInjectionStrategy {

    //Map a bean with child bean (bean with reference to other bean).
    //Mapping with invoking other mapper that is Spring component.
    //Injection strategy via constructor.

    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);
}