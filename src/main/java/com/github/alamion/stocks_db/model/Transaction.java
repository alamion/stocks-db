package com.github.alamion.stocks_db.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 */
@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SECURITY_ID", nullable = false)
    private Integer securityId;

    @Column(name = "DATE", nullable = false)
    private Date date;

    @Column(name = "PRICE", nullable = false, precision = 10, scale = 5)
    private BigDecimal price;

    @Column(name = "TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @OneToOne(optional = false)
    @JoinColumn(name = "ID")
    private Security security;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PORTFOLIO_ID", referencedColumnName = "ID")
    private Portfolio portfolio;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
