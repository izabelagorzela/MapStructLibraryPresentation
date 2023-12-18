package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Division;
import gorzela.izabela.MapStructDemo.entities.basicMappings.DivisionDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionMapperTest {

    @Test
    void shouldMapDivisionToDivisionDto() {

        Division division = new Division();
        division.setId(1);
        division.setName("Support");

        DivisionDto divisionDto = DivisionMapper.INSTANCE.divisionToDivisionDto(division);

        assertEquals(division.getId(), divisionDto.getId());
        assertEquals(division.getName(), divisionDto.getNameDto());
    }

    @Test
    void shouldMapDivisionDtoToDivision() {

        DivisionDto divisionDto = new DivisionDto();
        divisionDto.setId(1);
        divisionDto.setNameDto("Support");

        Division division = DivisionMapper.INSTANCE.divisionDtoToDivision(divisionDto);

        assertEquals(divisionDto.getId(), division.getId());
        assertEquals(divisionDto.getNameDto(), division.getName());
    }
}