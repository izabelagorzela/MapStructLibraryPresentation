package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Patient;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.PatientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapperWithGeneratedMethodForContactMapping {

    //Map a bean with child bean (bean with reference to other bean).
    //Demonstration of the generated child mapping code.

    PatientMapperWithGeneratedMethodForContactMapping INSTANCE = Mappers.getMapper(PatientMapperWithGeneratedMethodForContactMapping.class);

    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);
}