package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.entities.basicMappings.Coin;
import gorzela.izabela.MapStructDemo.entities.basicMappings.CoinDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CoinMapperTest {

    @Test
    void shouldMapCoinToCoinDto() {

        Coin coin = new Coin();
        coin.setKind("EUR");
        coin.setValue(1);

        CoinDto coinDto = CoinMapper.INSTANCE.coinToCoinDto(coin);

        assertEquals(coin.getKind(), coinDto.getKind());
        assertNull(coinDto.getValue());
    }
}