package gorzela.izabela.MapStructDemo.mappers.mappingColections;

import gorzela.izabela.MapStructDemo.entities.mappingCollections.BankUser;
import gorzela.izabela.MapStructDemo.entities.mappingCollections.BankUserDto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankUserMapperTest {

    @Test
    public void shouldMapBankUserToBankUserDto() {

        BankUser bankUser = new BankUser();
        List<Integer> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(763124564);
        phoneNumbers.add(136753421);

        Map<BigDecimal, Double> balance = new HashMap<>();
        balance.put(new BigDecimal("1239876555555555"), 1239876.98);
        balance.put(new BigDecimal("2987654328765422"), 13450.87);

        bankUser.setSurname("Kowalski");
        bankUser.setPhoneNumbers(phoneNumbers);
        bankUser.setBalance(balance);

        BankUserDto bankUserDto = BankUserMapper.INSTANCE.bankUserToBankUserDto(bankUser);

        assertEquals(bankUser.getSurname(), bankUserDto.getSurname());
        assertEquals(bankUser.getPhoneNumbers(), bankUserDto.getNumbersOfPhone());
        assertEquals(bankUser.getBalance(), bankUserDto.getBankAccount());
    }
}