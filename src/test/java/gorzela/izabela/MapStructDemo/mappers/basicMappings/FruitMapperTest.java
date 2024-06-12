package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case1.a.Fruit;
import gorzela.izabela.MapStructDemo.basicMappings.case1.a.FruitDto;
import gorzela.izabela.MapStructDemo.basicMappings.case1.a.FruitMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FruitMapperTest {

    @Test
    void shouldMapFruitToFruitDto() {

        Fruit fruit = new Fruit();
        fruit.setFruitColor("yellow");
        fruit.setFruitName("banana");

        FruitDto fruitDto = FruitMapper.INSTANCE.fruitToFruitDto(fruit);

        assertEquals(fruit.getFruitColor(), fruitDto.getFruitColor());
        assertEquals(fruit.getFruitName(), fruitDto.getFruitName());

    }
}