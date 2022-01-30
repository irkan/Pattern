package creational.abstractfactory;

import java.math.BigDecimal;

public class International implements Transfer{
    private String productCode;
    private String fromAccount;
    private String toAccount;
    private String currency;
    private BigDecimal amount;

    public International(String productCode, String fromAccount, String toAccount, String currency, BigDecimal amount) {
        this.productCode = productCode;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String getProductCode() {
        return productCode;
    }

    @Override
    public String getFromAccount() {
        return fromAccount;
    }

    @Override
    public String getToAccount() {
        return toAccount;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "International{" +
                "productCode='" + productCode + '\'' +
                ", fromAccount='" + fromAccount + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
