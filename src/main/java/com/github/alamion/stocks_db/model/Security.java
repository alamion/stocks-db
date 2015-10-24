package com.github.alamion.stocks_db.model;

import javax.persistence.*;

/**
 *
 */

@Entity
@Table(name = "SECURITIES")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private SecurityType type;

    public Security() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityType getType() {
        return type;
    }

    public void setType(SecurityType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Security [id = %d, code = %s, name = %s, type = %s]", id, code, name, type.toString());
    }
}
