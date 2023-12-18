package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Book;
import gorzela.izabela.MapStructDemo.entities.basicMappings.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    //Setting default value to a target property if the corresponding source property is null.

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    @Mapping(source = "id", target = "id",
            defaultValue = "14")
    BookDto bookToBookDto(Book book);
}