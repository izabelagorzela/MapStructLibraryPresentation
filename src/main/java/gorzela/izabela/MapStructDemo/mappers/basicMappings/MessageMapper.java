package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Message;
import gorzela.izabela.MapStructDemo.entities.basicMappings.MessageDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MessageMapper {

    //Mapping which updates an existing instance (target object).

    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);
    void updateMessageDtoFromMassage(Message message, @MappingTarget MessageDto massageDto);
}