package com.github.alamion.stocks_db.model;

import javax.persistence.*;

/**
 *
 */

@Entity
@Table(name = "STOCKS")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ticker;

    public Stock() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return String.format("Stock [id = %d, ticker = %s]", id, ticker);
    }
}
