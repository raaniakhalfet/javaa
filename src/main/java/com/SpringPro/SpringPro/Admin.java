package com.SpringPro.SpringPro;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ida;
    private String name;
    private String prenom;
    private String email;

    public Integer getIda() {
        return ida;
    }
    public void setIda(Integer ida) {
        this.ida = ida;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
