package gorzela.izabela.MapStructDemo.basicMappings.case2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    //@Mapping annotation is needed when properties name are different.
    //DefaultExpression is used to set value to target property when corresponding source property is null.

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "id", target = "userIdentifier")
    @Mapping(source = "surname", target = "surname", defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    PersonDto personToPersonDto(Person person);
}