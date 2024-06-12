package gorzela.izabela.MapStructDemo.basicMappings.case8;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DivisionMapper {

    //Inverse mappings.

    DivisionMapper INSTANCE = Mappers.getMapper(DivisionMapper.class);

    @Mapping(source = "name", target = "nameDto")
    DivisionDto divisionToDivisionDto(Division division);

    @InheritInverseConfiguration
    Division divisionDtoToDivision(DivisionDto divisionDto);
}