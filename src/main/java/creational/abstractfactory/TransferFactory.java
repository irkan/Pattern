package creational.abstractfactory;

import java.math.BigDecimal;

public interface TransferFactory {
    Transfer getTransfer(String productCode, String fromAccount, String toAccount, String currency, BigDecimal amount);
}
