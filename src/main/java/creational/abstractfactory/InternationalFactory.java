package creational.abstractfactory;

import java.math.BigDecimal;

public class InternationalFactory implements TransferFactory{
    @Override
    public Transfer getTransfer(String productCode, String fromAccount, String toAccount, String currency, BigDecimal amount) {
        return new International(productCode, fromAccount, toAccount, currency, amount);
    }
}
