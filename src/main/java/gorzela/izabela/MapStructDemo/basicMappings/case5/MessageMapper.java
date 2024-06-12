package gorzela.izabela.MapStructDemo.basicMappings.case5;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MessageMapper {

    //Mapping which updates an existing instance (target object).

    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);
    void updateMessageDtoFromMessage(Message message, @MappingTarget MessageDto massageDto);
}