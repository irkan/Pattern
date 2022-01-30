package creational.abstractfactory;

import java.math.BigDecimal;

public interface Transfer {
    String getProductCode();
    String getFromAccount();
    String getToAccount();
    String getCurrency();
    BigDecimal getAmount();
}
