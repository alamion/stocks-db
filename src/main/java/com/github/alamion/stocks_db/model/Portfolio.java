package com.github.alamion.stocks_db.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * User: A.Putintsev
 * Date: 24.10.15
 */
@Entity
@Table(name = "PORTFOLIOS")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;

    @OneToMany(mappedBy = "portfolio", targetEntity = Transaction.class, fetch = FetchType.LAZY)
    private Collection transactions;

    public Portfolio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
