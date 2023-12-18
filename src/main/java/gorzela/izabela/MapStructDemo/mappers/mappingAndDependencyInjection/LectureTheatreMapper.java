package gorzela.izabela.MapStructDemo.mappers.mappingAndDependencyInjection;

import gorzela.izabela.MapStructDemo.entities.mappingAndDependencyInjection.LectureTheatre;
import gorzela.izabela.MapStructDemo.entities.mappingAndDependencyInjection.LectureTheatreDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LectureTheatreMapper {

    //Mapping with using dependency injection.
    //Example to inject mapper.

    LectureTheatreDto lectureTheatreToLectureTheatreDto(LectureTheatre lectureTheatre);
}