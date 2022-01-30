package creational.abstractfactory;

import java.math.BigDecimal;

public class TransferExecutor {
    public static void main(String[] args) {
        InternalFactory internalFactory = new InternalFactory();
        Transfer internal = internalFactory.getTransfer("INTERNAL", "1111111111", "2222222222", "AZN", BigDecimal.valueOf(100));

        DomesticFactory domesticFactory = new DomesticFactory();
        Transfer domestic = domesticFactory.getTransfer("DOMESTIC", "3333333333", "4444444444", "AZN", BigDecimal.valueOf(200));

        InternationalFactory internationalFactory = new InternationalFactory();
        Transfer international = internationalFactory.getTransfer("INTERNATIONAL", "5555555555", "6666666666", "USD", BigDecimal.valueOf(300));

        System.out.println(internal);
        System.out.println(domestic);
        System.out.println(international);
    }
}
