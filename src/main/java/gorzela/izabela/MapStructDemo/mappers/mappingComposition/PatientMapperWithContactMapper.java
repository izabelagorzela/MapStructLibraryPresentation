package gorzela.izabela.MapStructDemo.mappers.mappingComposition;

import gorzela.izabela.MapStructDemo.entities.mappingComposition.Patient;
import gorzela.izabela.MapStructDemo.entities.mappingComposition.PatientDto;
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