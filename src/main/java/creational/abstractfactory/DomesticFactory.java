package creational.abstractfactory;

import java.math.BigDecimal;

public class DomesticFactory implements TransferFactory{
    @Override
    public Transfer getTransfer(String productCode, String fromAccount, String toAccount, String currency, BigDecimal amount) {
        return new Domestic(productCode, fromAccount, toAccount, currency, amount);
    }
}
