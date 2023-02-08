package pl.javastart.task;

import java.math.BigDecimal;

public class Current {
    private String name;
    private BigDecimal rate;

    public Current(String name, BigDecimal rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return name + ", " + rate;
    }
}
