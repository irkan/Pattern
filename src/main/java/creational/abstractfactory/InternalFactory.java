package creational.abstractfactory;

import java.math.BigDecimal;

public class InternalFactory implements TransferFactory{
    @Override
    public Transfer getTransfer(String productCode, String fromAccount, String toAccount, String currency, BigDecimal amount) {
        return new Internal(productCode, fromAccount, toAccount, currency, amount);
    }
}
