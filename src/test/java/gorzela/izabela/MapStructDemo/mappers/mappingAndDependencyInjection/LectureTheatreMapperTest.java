package gorzela.izabela.MapStructDemo.mappers.mappingAndDependencyInjection;

import gorzela.izabela.MapStructDemo.mappingAndDependencyInjection.LectureTheatre;
import gorzela.izabela.MapStructDemo.mappingAndDependencyInjection.LectureTheatreDto;
import gorzela.izabela.MapStructDemo.mappingAndDependencyInjection.LectureTheatreMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LectureTheatreMapperTest {

    @Autowired
    LectureTheatreMapper lectureTheatreMapper;

    @Test
    public void shouldMapLectureTheatreToLectureTheatreDto() {

        LectureTheatre lectureTheatre = new LectureTheatre();
        lectureTheatre.setName("Aula Leopoldina");
        lectureTheatre.setIsOccupied(true);

        LectureTheatreDto lectureTheatreDto = lectureTheatreMapper.lectureTheatreToLectureTheatreDto(lectureTheatre);

        assertEquals(lectureTheatre.getName(), lectureTheatreDto.getName());
        assertEquals(lectureTheatre.getIsOccupied(), lectureTheatreDto.getIsOccupied());
    }
}