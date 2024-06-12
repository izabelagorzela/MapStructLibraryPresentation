package gorzela.izabela.MapStructDemo.mappingAndDependencyInjection;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LectureTheatreMapper {

    //Mapping with using dependency injection.
    //Example to inject mapper.

    LectureTheatreDto lectureTheatreToLectureTheatreDto(LectureTheatre lectureTheatre);
}