package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Fruit;
import gorzela.izabela.MapStructDemo.entities.basicMappings.FruitDto;
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