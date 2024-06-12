package gorzela.izabela.MapStructDemo.mappingCollections;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class BankUserDto {

    private String surname;
    private List<Integer> numbersOfPhone;
    private Map<BigDecimal, Double> bankAccount;
}