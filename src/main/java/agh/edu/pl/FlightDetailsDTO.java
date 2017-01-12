package agh.edu.pl;

import org.joda.time.LocalDate;

import java.io.Serializable;
import java.math.BigDecimal;


public class FlightDetailsDTO implements Serializable {

    private static final long serialVersionUID = 1321312312L;

    private String from;

    private String to;

    private LocalDate fromDate;

    private LocalDate toDate;

    private BigDecimal priceInEuro;

    public FlightDetailsDTO() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public BigDecimal getPriceInEuro() {
        return priceInEuro;
    }

    public void setPriceInEuro(BigDecimal priceInEuro) {
        this.priceInEuro = priceInEuro;
    }
}