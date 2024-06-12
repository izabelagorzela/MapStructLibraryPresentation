package gorzela.izabela.MapStructDemo.mappingComposition.case4;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.AbstractContactMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class ContactMapperWithInjectionStrategy extends AbstractContactMapper {
}