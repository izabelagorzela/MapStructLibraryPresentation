package gorzela.izabela.MapStructDemo.mappingComposition.case2;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.Patient;
import gorzela.izabela.MapStructDemo.mappingComposition.shared.PatientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses= ContactMapper.class)
public interface PatientMapperWithContactMapper {

    //Map a bean with child bean (bean with reference to other bean).
    //Mapping with invoking other mapper.

    PatientMapperWithContactMapper INSTANCE = Mappers.getMapper(PatientMapperWithContactMapper.class);
    @Mapping(source = "contact", target = "contactDto")
    PatientDto patientToPatientDto(Patient patient);
}