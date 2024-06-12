package gorzela.izabela.MapStructDemo.mappingComposition.case1;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.Patient;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.PatientDto;
import gorzela.izabela.MapStructDemo.mappingComposition.case2.PatientMapperWithContactMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapperWithGeneratedMethodForContactMapping {

    //Map a bean with child bean (bean with reference to other bean).
    //Demonstration of the generated child mapping code.

    PatientMapperWithContactMapper INSTANCE = Mappers.getMapper(PatientMapperWithContactMapper.class);
    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);
}