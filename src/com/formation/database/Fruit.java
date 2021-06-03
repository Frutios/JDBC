package com.formation.database;

import java.time.LocalDate;

public class Fruit {

    private Long id;
    private String name;
    private LocalDate expirationDate;

    public Fruit(String name, LocalDate expirationDate){
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Fruit(Long id, String name, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
