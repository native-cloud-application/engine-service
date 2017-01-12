package agh.edu.pl;


import java.io.Serializable;
import java.math.BigDecimal;

public class Price implements Serializable{

    private static final long serialVersionUID = 21312312L;

    private Currency currency;

    private BigDecimal amount;

    public Price() {}

    public Price(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
