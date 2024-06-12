package gorzela.izabela.MapStructDemo.mappingComposition.case3;

import gorzela.izabela.MapStructDemo.mappingComposition.shared.AbstractContactMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class ContactMapperAsSpringComponent extends AbstractContactMapper {
}