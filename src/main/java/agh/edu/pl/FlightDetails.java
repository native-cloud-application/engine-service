package agh.edu.pl;


import org.joda.time.LocalDate;

import java.io.Serializable;
import java.util.List;

public class FlightDetails implements Serializable{

    private static final long serialVersionUID = 1321312312L;

    private String from;

    private String to;

    private List<Price> priceList;

    private LocalDate fromDate;

    private LocalDate toDate;

    public FlightDetails() {
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


    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
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
}
