package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case4.Coin;
import gorzela.izabela.MapStructDemo.basicMappings.case4.CoinDto;
import gorzela.izabela.MapStructDemo.basicMappings.case4.CoinMapper;
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