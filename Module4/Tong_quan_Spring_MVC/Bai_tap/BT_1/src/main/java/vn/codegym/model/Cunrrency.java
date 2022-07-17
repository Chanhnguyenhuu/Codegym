package vn.codegym.model;

public class Cunrrency {
    private Double usd;
    private Double rate;

    public Cunrrency() {
    }

    public Cunrrency(Double usd, Double rate) {
        this.usd = usd;
        this.rate = rate;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
